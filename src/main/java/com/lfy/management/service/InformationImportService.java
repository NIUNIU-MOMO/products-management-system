package com.lfy.management.service;

import com.lfy.management.entity.*;
import com.lfy.management.mapper.InformationImportMapper;
import com.lfy.management.pojo.ImportResult;
import com.lfy.management.utils.ExcelAnalyseUtils;
import com.lfy.management.utils.PackagingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class InformationImportService {

    @Autowired(required = false)
    private InformationImportMapper informationImportMapper;

    @Value("#{new com.lfy.management.pojo.ImportResult()}")
    ImportResult importResult;

    @Transactional
    public ImportResult importErrValueTestFile(MultipartFile errValueTestFile) {
        try {
            String errValueTestFileFilename = errValueTestFile.getOriginalFilename();
            InputStream errValueTestFileInputStream = errValueTestFile.getInputStream();
            List<List<Object>> errValueTestLists = ExcelAnalyseUtils.analysisExcelFile(errValueTestFileInputStream, errValueTestFileFilename);
            List<ErrValueTest> errValueTestList = PackagingUtils.packagingErrValueTest(errValueTestLists);
//            System.out.println(errValueTestList.size());
            for (int i = 0; i < errValueTestList.size(); i++) {
                ErrValueTest errValueTest = errValueTestList.get(i);
                informationImportMapper.insertErrValueTest(errValueTest);
            }
            String tableName = "T_ERRVALUETEST";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(errValueTestList.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }
    }

    @Transactional
    public ImportResult importAutoErrValueTestFile(MultipartFile autoErrValueTestFile) {
        try {
            String autoErrValueTestFileFilename = autoErrValueTestFile.getOriginalFilename();
            InputStream autoErrValueTestFileInputStream = autoErrValueTestFile.getInputStream();
            List<List<Object>> autoErrValueTestLists = ExcelAnalyseUtils.analysisExcelFile(autoErrValueTestFileInputStream, autoErrValueTestFileFilename);
            List<AutoErrValueTest> autoErrValueTestList = PackagingUtils.packagingAutoErrValueTest(autoErrValueTestLists);
            for (int i = 0; i < autoErrValueTestList.size(); i++) {
                AutoErrValueTest autoErrValueTest = autoErrValueTestList.get(i);
                informationImportMapper.insertAutoErrValueTest(autoErrValueTest);
            }
            String tableName = "T_AUTOERRVALUETEST";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(autoErrValueTestList.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }
    }

    @Transactional
    public ImportResult importProductTestFile(MultipartFile productTestFile) {
        try {
            String productTestFileFilename = productTestFile.getOriginalFilename();
            InputStream productTestFileInputStream = productTestFile.getInputStream();
            List<List<Object>> productTestLists = ExcelAnalyseUtils.analysisExcelFile(productTestFileInputStream, productTestFileFilename);
            List<ProductTest> productTestList = PackagingUtils.packagingProductTest(productTestLists);
            for (int i = 0; i < productTestList.size(); i++) {
                ProductTest productTest = productTestList.get(i);
                informationImportMapper.insertProductTest(productTest);
            }
            String tableName = "T_PRODUCTTEST";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(productTestList.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }

    }

    @Transactional
    public ImportResult importTempTestDataV1File(MultipartFile tempTestDataV1File) {
        try {
            String tempTestDataV1FileFilename = tempTestDataV1File.getOriginalFilename();
            InputStream tempTestDataV1FileInputStream = tempTestDataV1File.getInputStream();
            List<List<Object>> tempTestDataV1Lists = ExcelAnalyseUtils.analysisExcelFile(tempTestDataV1FileInputStream, tempTestDataV1FileFilename);
            List<TempTestDataV1> tempTestDataV1List = PackagingUtils.packagingTempTestDataV1(tempTestDataV1Lists);
            for (int i = 0; i < tempTestDataV1List.size(); i++) {
                TempTestDataV1 tempTestDataV1 = tempTestDataV1List.get(i);
                informationImportMapper.insertTempTestDataV1(tempTestDataV1);
            }
            String tableName = "T_TEMPTESTDATAV1";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(tempTestDataV1List.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }
    }

    @Transactional
    public ImportResult importTempTestDataV2File(MultipartFile tempTestDataV2File) {
        try {
            String tempTestDataV2FileFilename = tempTestDataV2File.getOriginalFilename();
            InputStream tempTestDataV2FileInputStream = tempTestDataV2File.getInputStream();
            List<List<Object>> tempTestDataV2Lists = ExcelAnalyseUtils.analysisExcelFile(tempTestDataV2FileInputStream, tempTestDataV2FileFilename);
            List<TempTestDataV2> tempTestDataV2List = PackagingUtils.packagingTempTestDataV2(tempTestDataV2Lists);
            for (int i = 0; i < tempTestDataV2List.size(); i++) {
                TempTestDataV2 tempTestDataV2 = tempTestDataV2List.get(i);
                informationImportMapper.insertTempTestDataV2(tempTestDataV2);
            }
            String tableName = "T_TEMPTESTDATAV2";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(tempTestDataV2List.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }

    }

    @Transactional
    public ImportResult importMeterNoFile(MultipartFile meterNoFile) {
        try {
            String meterNoFileName = meterNoFile.getOriginalFilename();
            InputStream meterNoFileInputStream = meterNoFile.getInputStream();
            List<List<Object>> meterNoLists = ExcelAnalyseUtils.analysisExcelFile(meterNoFileInputStream, meterNoFileName);
            List<MeterNo> meterNoList = PackagingUtils.packagingMeterNo(meterNoLists);
//            System.out.println(meterNoList.size());
            for (int i = 0; i < meterNoList.size(); i++) {
                MeterNo meterNo = meterNoList.get(i);
                informationImportMapper.insertMeterNo(meterNo);
            }
            String tableName = "T_METERNO";
            informationImportMapper.insertTableRecordByTableName(tableName);
            informationImportMapper.updateInsertIDByTableName(tableName);
            importResult.setItems(meterNoList.size());
            importResult.setResult("成功！");
            return importResult;
        } catch (Exception e) {
            e.printStackTrace();
            importResult.setItems(0);
            importResult.setResult("失败！");
            return importResult;
        }
    }
}
