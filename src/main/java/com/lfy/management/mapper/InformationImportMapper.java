package com.lfy.management.mapper;

import com.lfy.management.entity.*;
import org.apache.ibatis.annotations.Param;

public interface InformationImportMapper {

    void insertTableRecordByTableName(@Param("tableName") String tableName);

    void updateInsertIDByTableName(@Param("tableName") String tableName);

    void insertMeterNo(MeterNo meterNo);

    void insertErrValueTest(ErrValueTest errValueTest);

    void insertAutoErrValueTest(AutoErrValueTest autoErrValueTest);

    void insertProductTest(ProductTest productTest);

    void insertTempTestDataV1(TempTestDataV1 tempTestDataV1);

    void insertTempTestDataV2(TempTestDataV2 tempTestDataV2);
}
