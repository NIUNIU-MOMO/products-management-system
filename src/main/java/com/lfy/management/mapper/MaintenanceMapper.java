package com.lfy.management.mapper;

import org.apache.ibatis.annotations.Param;

public interface MaintenanceMapper {
//    int selectMeterNoCount();
//
//    int selectProductCount();
//
//    int selectErrValueCount();
//
//    int selectAutoErrValueCount();
//
//    int selectTempDataV1Count();
//
//    int selectTempDataV2Count();
//
//    int selectMeterInformationCount();
//
//    int selecterrValueAnalyseCount();

    int selectTableCountByTableName(@Param("tableName") String tableName);

    int selectSavedRecordsByTableName(@Param("tableName") String tableName);

    int selectUnSavedRecordsByTableName(@Param("tableName") String tableName);
}
