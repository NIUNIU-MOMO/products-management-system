package com.lfy.management.mapper;

import com.lfy.management.entity.TestErrValueAnalyse;
import com.lfy.management.entity.MeterInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AJAXMapper {
    MeterInformation selectMeterInformationByMeterNo(String meterNo);

    List<MeterInformation> selectMeterInformationByMeterNoFile(Map map);

    void insertMeterInformationByMeterNo(String meterNo);

    void insertMeterInformationByMeterNoFile();

    int selectMeterInformationCount();

    void executeErrValueAnalysev1();

    void executeErrValueAnalysev2();

    void executeOtherTestDataDeal();

    List<TestErrValueAnalyse> selectTestErrValueAnalyse(Map map);

    int selectTestErrValueAnalyseCount();


    int delRecentRecordByTableName(@Param("tableName") String tableName);

    int selectCountByTableName(@Param("tableName") String tableName);

    int truncateTableByTableName(@Param("tableName") String tableName);



    void clearRecordByTableName(@Param("tableName") String tableName);

    void saveRecordByTableName(@Param("tableName") String tableName);

    int selectSavedItemsByTableName(@Param("tableName") String tableName);

    int selectUnSavedItemsByTableName(@Param("tableName") String tableName);

    List<MeterInformation> selectAllMeterInformation();

    List<TestErrValueAnalyse> selectAllTestErrValueAnalyse();
}
