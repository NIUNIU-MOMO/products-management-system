package com.lfy.management.service;

import com.lfy.management.entity.TestErrValueAnalyse;
import com.lfy.management.mapper.AJAXMapper;
import com.lfy.management.entity.MeterInformation;
import com.lfy.management.pojo.MaintenanceSystemTableResult;
import com.lfy.management.pojo.QueryResult;
import com.lfy.management.pojo.SaveORClearResult;
import com.lfy.management.utils.ExcelExportUtils;
import com.lfy.management.utils.GetCurrentTime;
import com.lfy.management.utils.PackagingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AJAXService {

    @Value("#{new java.util.ArrayList()}")
    List<MeterInformation> resultList;

    @Value("#{new com.lfy.management.pojo.MaintenanceSystemTableResult()}")
    MaintenanceSystemTableResult maintenanceSystemTableResult;
    @Value("#{new com.lfy.management.pojo.SaveORClearResult()}")
    SaveORClearResult saveORClearResult;
    @Value("#{new com.lfy.management.utils.GetCurrentTime()}")
    GetCurrentTime currentTime;


    @Autowired(required = false)
    private AJAXMapper ajaxMapper;

    // 查询单个产品信息
    public List getMeterInformationByMeterNo(String meterNo) {
        //  先执行查询插入
        ajaxMapper.insertMeterInformationByMeterNo(meterNo);
        // 封装结果
        MeterInformation meterInformation = ajaxMapper.selectMeterInformationByMeterNo(meterNo);
        resultList.clear();
        resultList.add(meterInformation);
        return resultList;
    }

    // 批量查询产品信息
    public QueryResult getProductsInformation(QueryResult queryResult) {
//    public List getProductsInformation() {
        // 先执行查询插入
//        ajaxMapper.insertMeterInformationByMeterNoFile();
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("currentPage", 2);
//        map.put("pageSize", 10);
//        resultList = ajaxMapper.selectMeterInformationByMeterNoFile(map);
//        System.out.println(resultList);
//        return resultList;
        // 设置 总记录数和总页数
        int items = ajaxMapper.selectMeterInformationCount();
        int totalPage = (int) Math.ceil(((double) items) / queryResult.getPageSize());
        queryResult.setAmount(items);
        queryResult.setTotalPage(totalPage);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        // 查询结果集
        List resultList = ajaxMapper.selectMeterInformationByMeterNoFile(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
    }

    // 批量查询产品信息上一页
    public QueryResult getPrePageProductsInformation(QueryResult queryResult) {
        if (queryResult.getCurrentPage() <= 1) {
            queryResult.setCurrentPage(1);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        // 查询结果集
        List resultList = ajaxMapper.selectMeterInformationByMeterNoFile(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
//        return queryResult;
    }

    // 批量查询产品信息下一页
    public QueryResult getNextPageProductsInformation(QueryResult queryResult) {
        if (queryResult.getCurrentPage() >= queryResult.getTotalPage()) {
            queryResult.setCurrentPage(queryResult.getTotalPage());
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        // 查询结果集
        List resultList = ajaxMapper.selectMeterInformationByMeterNoFile(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
    }

    // 执行匹配V1
    public String execMatchV1() {
        try {
            ajaxMapper.executeErrValueAnalysev1();
            return "执行成功！";
        } catch (Exception e) {
//            e.printStackTrace();
            return "执行失败！";
        }
    }

    // 执行匹配V2
    public String execMatchV2() {
        try {
            ajaxMapper.executeOtherTestDataDeal();
            ajaxMapper.executeErrValueAnalysev2();
            return "执行成功！";
        } catch (Exception e) {
//            e.printStackTrace();
            return "执行失败！";
        }
    }

    // 检验数据对比结果查询
    public QueryResult getAnalyseResult(QueryResult queryResult) {
        // 设置 总记录数和总页数
        int items = ajaxMapper.selectTestErrValueAnalyseCount();
        int totalPage = (int) Math.ceil(((double) items) / queryResult.getPageSize());
        queryResult.setAmount(items);
        queryResult.setTotalPage(totalPage);
        // 查询执行结果
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        List resultList = ajaxMapper.selectTestErrValueAnalyse(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
    }

    //检验数据对比结果查询上一页
    public QueryResult getPrePagetesterrvalueanalyse(QueryResult queryResult) {
        if (queryResult.getCurrentPage() <= 1) {
            queryResult.setCurrentPage(1);
        }
        // 查询执行结果
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        List resultList = ajaxMapper.selectTestErrValueAnalyse(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
    }

    //检验数据对比结果查询下一页
    public QueryResult getNextPagetesterrvalueanalyse(QueryResult queryResult) {
        if (queryResult.getCurrentPage() >= queryResult.getTotalPage()) {
            queryResult.setCurrentPage(queryResult.getTotalPage());
        }
        // 查询执行结果
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("currentPage", queryResult.getCurrentPage());
        map.put("pageSize", queryResult.getPageSize());
        List resultList = ajaxMapper.selectTestErrValueAnalyse(map);
        // 封装结果集
        queryResult.setResultSet(resultList);
        // 返回查询结果对象
        return queryResult;
    }


    // 删除最近更新数据
    private MaintenanceSystemTableResult delRecentRecord(String tableName) {
        try {
            int deleteItems = ajaxMapper.delRecentRecordByTableName(tableName);
            int remainItems = ajaxMapper.selectCountByTableName(tableName);
            maintenanceSystemTableResult.setDeleteItems(deleteItems);
            maintenanceSystemTableResult.setRemainItems(remainItems);
            maintenanceSystemTableResult.setMaintenanceTesult("执行成功！");
            return maintenanceSystemTableResult;
        } catch (Exception e) {
//            e.printStackTrace();
            maintenanceSystemTableResult.setDeleteItems(0);
            maintenanceSystemTableResult.setRemainItems(0);
            maintenanceSystemTableResult.setMaintenanceTesult("执行失败！");
            return maintenanceSystemTableResult;
        }
    }

    // 清空表数据
    private MaintenanceSystemTableResult truncateTableByTableName(String tableName) {
        try {
            int deleteItems = ajaxMapper.truncateTableByTableName(tableName);
            int remainItems = ajaxMapper.selectCountByTableName(tableName);
            maintenanceSystemTableResult.setDeleteItems(deleteItems);
            maintenanceSystemTableResult.setRemainItems(remainItems);
            maintenanceSystemTableResult.setMaintenanceTesult("执行成功！");
            return maintenanceSystemTableResult;
        } catch (Exception e) {
//            e.printStackTrace();
            maintenanceSystemTableResult.setDeleteItems(0);
            maintenanceSystemTableResult.setRemainItems(0);
            maintenanceSystemTableResult.setMaintenanceTesult("执行失败！");
            return maintenanceSystemTableResult;
        }

    }


    // 删除最近更新--成品检验记录
    public MaintenanceSystemTableResult delRecentProdectTest() {
        return delRecentRecord("T_PRODUCTTEST");
    }

    // 删除最近更新--检验室检验记录
    public MaintenanceSystemTableResult delRecentErrValueTest() {
        return delRecentRecord("T_ERRVALUETEST");
    }

    // 删除最近更新--自动线检验记录
    public MaintenanceSystemTableResult delRecentAutoErrValueTest() {
        return delRecentRecord("T_AUTOERRVALUETEST");
    }


    //清空表号信息记录 truncateMeterNo
    public MaintenanceSystemTableResult truncateMeterNo() {
        return truncateTableByTableName("T_METERNO");
    }

    //清空外部检验记录V1 truncateTempDataV1
    public MaintenanceSystemTableResult truncateTempDataV1() {
        return truncateTableByTableName("T_TEMPTESTDATAV1");
    }

    //清空外部检验记录V2 truncateTempDataV2
    public MaintenanceSystemTableResult truncateTempDataV2() {
        return truncateTableByTableName("T_TEMPTESTDATAV2");
    }

    //清空产品信息查询结果 truncateMeterInformation
    public MaintenanceSystemTableResult truncateMeterInformation() {
        return truncateTableByTableName("T_METERINFORMATION");
    }

    //清空外部检验数据对比结果 truncateTestErrValueAnalyse
    public MaintenanceSystemTableResult truncateTestErrValueAnalyse() {
        return truncateTableByTableName("T_TESTERRVALUEANALYSE");
    }


    // 执行批量匹配产品信息
    public String execMatch() {
        try {
            ajaxMapper.insertMeterInformationByMeterNoFile();
            return "执行成功！";
        } catch (Exception e) {
//            e.printStackTrace();
            return "执行失败！";
        }
    }

    // 保存记录
    private SaveORClearResult saveRecordByTableName(String tableName) {
        try {
            ajaxMapper.saveRecordByTableName(tableName);
            saveORClearResult.setSavedItems(ajaxMapper.selectSavedItemsByTableName(tableName));
            saveORClearResult.setUnsavedItems(ajaxMapper.selectUnSavedItemsByTableName(tableName));
            return saveORClearResult;
        } catch (Exception e) {
//            e.printStackTrace();
            return null;
        }
    }

    // 删除记录
    private SaveORClearResult clearRecordByTableName(String tableName) {
        try {
            ajaxMapper.clearRecordByTableName(tableName);
            saveORClearResult.setSavedItems(ajaxMapper.selectSavedItemsByTableName(tableName));
            saveORClearResult.setUnsavedItems(ajaxMapper.selectUnSavedItemsByTableName(tableName));
            return saveORClearResult;
        } catch (Exception e) {
//            e.printStackTrace();
            return null;
        }

    }


    public SaveORClearResult saveProductTest() {
        return saveRecordByTableName("T_PRODUCTTEST");
    }

    public SaveORClearResult saveErrValueTest() {
        return saveRecordByTableName("T_ERRVALUETEST");
    }

    public SaveORClearResult saveAutoErrValueTest() {

        return saveRecordByTableName("T_AUTOERRVALUETEST");
    }

    public SaveORClearResult clearUnSaveProductTest() {
        return clearRecordByTableName("T_PRODUCTTEST");
    }

    public SaveORClearResult clearUnSaveErrValueTest() {
        return clearRecordByTableName("T_ERRVALUETEST");
    }

    public SaveORClearResult clearUnSaveAutoErrValueTest() {
        return clearRecordByTableName("T_AUTOERRVALUETEST");
    }

    public String execExportProductsInformation() {
        try {
            // Excel表的标题
            ExcelExportUtils.setTitle("Products-Information");
            // Excel表的列名
            String[] rowName = {"表号", "检验编号", "Qmax", "Qmid", "Qmin", "压损", "压损检验结果", "大气压强", "室温", "相对湿度", "检验人员", "检验时间", "制造厂商"};
            ExcelExportUtils.setRowName(rowName);
            // Excel表的文件名
            ExcelExportUtils.setFileName("产品信息" + currentTime.getCurrentTime() + ".xls");
            // Excel 的内容
            List<MeterInformation> meterInformationList = ajaxMapper.selectAllMeterInformation();
            List<List<String>> dataList = PackagingUtils.dePackagingMetersInformaution(meterInformationList);
            ExcelExportUtils.setDataList(dataList);
            // 执行导出
//            System.out.println("执行导出");
            ExcelExportUtils.exportExccel();

            return "导出成功！";
        } catch (Exception e) {
            e.printStackTrace();
            return "导出失败！";
        }
    }

    public String execExportErrValueAnalyse() {
        try {
            // Excel表的标题
            ExcelExportUtils.setTitle("Analyse-Result");
            // Excel表的列名
            String[] rowName = {"表号", "检验编号", "QMAX_QC", "QMID_QC", "QMAX_JBS", "QMID_JBS", "QMAX_ERR", "QMID_ERR"};
            ExcelExportUtils.setRowName(rowName);
            // Excel表的文件名
            ExcelExportUtils.setFileName("检验数据对比" + currentTime.getCurrentTime() + ".xls");
            // Excel 的内容
            List<TestErrValueAnalyse> errValueAnalyseList = ajaxMapper.selectAllTestErrValueAnalyse();
            List<List<String>> dataList = PackagingUtils.dePackagingErrValueAnalyse(errValueAnalyseList);
            ExcelExportUtils.setDataList(dataList);
            // 执行导出
            ExcelExportUtils.exportExccel();

            return "导出成功！";
        } catch (Exception e) {
            e.printStackTrace();
            return "导出失败！";
        }

    }
}
