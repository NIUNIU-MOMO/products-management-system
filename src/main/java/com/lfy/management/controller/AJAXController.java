package com.lfy.management.controller;

import com.lfy.management.pojo.MaintenanceSystemTableResult;
import com.lfy.management.pojo.QueryResult;
import com.lfy.management.pojo.SaveORClearResult;
import com.lfy.management.service.AJAXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class AJAXController {

    @Autowired
    private AJAXService ajaxService;

    @Value("#{new com.lfy.management.pojo.QueryResult()}")
    QueryResult queryResult;

    // 查询单个产品信息
    @RequestMapping("/getSingleMeterInformation")
    public List getMeterInformation(String meterNo) {
        if (meterNo != null) {
            return ajaxService.getMeterInformationByMeterNo(meterNo);
        } else {
            return null;
        }
    }

    // 执行批量匹配产品信息
    @RequestMapping("/execMatch")
    @ResponseBody
    public String execMatch(){
       return ajaxService.execMatch();
    }

    // 批量查询产品信息
    @RequestMapping("/getProductsInformation")
    @ResponseBody
    public QueryResult getProductsInformation() {
        // 创建查询结果对象  当前页为1
//        queryResult = new QueryResult();
        queryResult.setCurrentPage(1);
        queryResult = ajaxService.getProductsInformation(queryResult);
//        System.out.println("返回查询到的结果集："+queryResult.getResultSet());
//        System.out.println("当前页：" + queryResult.getCurrentPage());
//        System.out.println("总记录数：" + queryResult.getAmount());
//        System.out.println("总页数：" + queryResult.getTotalPage());
        return queryResult;
    }

    // 批量查询产品信息上一页
    @RequestMapping("/getPrePageProductsInformation")
    @ResponseBody
    public QueryResult getPrePageProductsInformation(int amount,int currentPage,int totalPage){
        queryResult.setCurrentPage(currentPage - 1); // 设置当前页
        queryResult.setAmount(amount); // 设置记录总数
        queryResult.setTotalPage(totalPage);
        queryResult = ajaxService.getPrePageProductsInformation(queryResult);
        return queryResult;
    }

    // 批量查询产品信息下一页
    @RequestMapping("/getNextPageProductsInformation")
    @ResponseBody
    public QueryResult getNextPageProductsInformation(int amount,int currentPage,int totalPage){
        queryResult.setCurrentPage(currentPage + 1); // 设置当前页
        queryResult.setAmount(amount); // 设置记录总数
        queryResult.setTotalPage(totalPage);
        queryResult = ajaxService.getNextPageProductsInformation(queryResult);
        return queryResult;
    }


    // 执行匹配V1
    @RequestMapping("/execMatchV1")
    @ResponseBody
    public String execMatchV1(){
        String execResult = ajaxService.execMatchV1();
        return execResult;
    }

    // 执行匹配V2
    @RequestMapping("/execMatchV2")
    @ResponseBody
    public String execMatchV2(){
        String execResult = ajaxService.execMatchV2();
        return execResult;
    }

    //检验数据对比结果查询
    @RequestMapping("/getAnalyseResult")
    @ResponseBody
    public QueryResult getAnalyseResult(){

//        queryResult = new QueryResult();
        queryResult.setCurrentPage(1);
        queryResult = ajaxService.getAnalyseResult(queryResult);
        return queryResult;
    }

    //检验数据对比结果查询上一页
    @RequestMapping("/getPrePagetesterrvalueanalyse")
    @ResponseBody
    public QueryResult getPrePagetesterrvalueanalyse(int amount,int currentPage,int totalPage){
        queryResult.setCurrentPage(currentPage - 1); // 设置当前页
        queryResult.setAmount(amount); // 设置记录总数
        queryResult.setTotalPage(totalPage);
        queryResult = ajaxService.getPrePagetesterrvalueanalyse(queryResult);
        return queryResult;
    }

    //检验数据对比结果查询下一页
    @RequestMapping("/getNextPagetesterrvalueanalyse")
    @ResponseBody
    public QueryResult getNextPagetesterrvalueanalyse(int amount,int currentPage,int totalPage){
        queryResult.setCurrentPage(currentPage + 1); // 设置当前页
        queryResult.setAmount(amount); // 设置记录总数
        queryResult.setTotalPage(totalPage);
        queryResult = ajaxService.getNextPagetesterrvalueanalyse(queryResult);
        return queryResult;
    }

    // 删除最近更新成品检验记录
    @RequestMapping("/delRecentProdectTest")
    @ResponseBody
    public MaintenanceSystemTableResult delRecentProdectTest(){
        return ajaxService.delRecentProdectTest();
    }

    // 删除最近更新检验室检验记录
    @RequestMapping("/delRecentErrValueTest")
    @ResponseBody
    public MaintenanceSystemTableResult delRecentErrValueTestf(){
        return ajaxService.delRecentErrValueTest();
    }

    // 删除最近更新自动线检验记录
    @RequestMapping("/delRecentAutoErrValueTest")
    @ResponseBody
    public MaintenanceSystemTableResult delRecentAutoErrValueTest(){
        return ajaxService.delRecentAutoErrValueTest();
    }

    //清空表号信息记录 truncateMeterNo
    @RequestMapping("/truncateMeterNo")
    @ResponseBody
    public MaintenanceSystemTableResult truncateMeterNo(){
        return ajaxService.truncateMeterNo();
    }

    //清空外部检验记录V1 truncateTempDataV1
    @RequestMapping("/truncateTempDataV1")
    @ResponseBody
    public MaintenanceSystemTableResult truncateTempDataV1(){
        return ajaxService.truncateTempDataV1();
    }

    //清空外部检验记录V2 truncateTempDataV2
    @RequestMapping("/truncateTempDataV2")
    @ResponseBody
    public MaintenanceSystemTableResult truncateTempDataV2(){
        return ajaxService.truncateTempDataV2();
    }

    //清空产品信息查询结果 truncateMeterInformation
    @RequestMapping("/truncateMeterInformation")
    @ResponseBody
    public MaintenanceSystemTableResult truncateMeterInformation(){
        return ajaxService.truncateMeterInformation();
    }

    //清空外部检验数据对比结果 truncateTestErrValueAnalyse
    @RequestMapping("/truncateTestErrValueAnalyse")
    @ResponseBody
    public MaintenanceSystemTableResult truncateTestErrValueAnalyse(){
        return ajaxService.truncateTestErrValueAnalyse();
    }


    // saveProductTest
    @RequestMapping("/saveProductTest")
    @ResponseBody
    public SaveORClearResult saveProductTest(){
        return ajaxService.saveProductTest();
    }

    // saveErrValueTest
    @RequestMapping("/saveErrValueTest")
    @ResponseBody
    public SaveORClearResult saveErrValueTest(){
        return ajaxService.saveErrValueTest();
    }

    // saveAutoErrValueTest
    @RequestMapping("/saveAutoErrValueTest")
    @ResponseBody
    public SaveORClearResult saveAutoErrValueTest(){
        return ajaxService.saveAutoErrValueTest();
    }

    // clearUnSaveProductTest
    @RequestMapping("/clearUnSaveProductTest")
    @ResponseBody
    public SaveORClearResult clearUnSaveProductTest(){
        return ajaxService.clearUnSaveProductTest();
    }

    // clearUnSaveErrValueTest
    @RequestMapping("/clearUnSaveErrValueTest")
    @ResponseBody
    public SaveORClearResult clearUnSaveErrValueTest(){
        return ajaxService.clearUnSaveErrValueTest();
    }

    // clearUnSaveAutoErrValueTest
    @RequestMapping("/clearUnSaveAutoErrValueTest")
    @ResponseBody
    public SaveORClearResult clearUnSaveAutoErrValueTest(){
        return ajaxService.clearUnSaveAutoErrValueTest();
    }


    // execExportProductsInformation
    @RequestMapping("/execExportProductsInformation")
    @ResponseBody
    public String execExportProductsInformation(){
        return ajaxService.execExportProductsInformation();
    }

    // execExportErrValueAnalyse
    @RequestMapping("/execExportErrValueAnalyse")
    @ResponseBody
    public String execExportErrValueAnalyse(){
        return ajaxService.execExportErrValueAnalyse();
    }








}
