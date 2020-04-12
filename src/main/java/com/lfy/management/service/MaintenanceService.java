package com.lfy.management.service;

import com.lfy.management.mapper.MaintenanceMapper;
import com.lfy.management.pojo.SystemRecordItems;
import com.lfy.management.pojo.TableCountResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService {

    @Autowired(required = false)
    private MaintenanceMapper maintenanceMapper;

    @Value("#{new com.lfy.management.pojo.SystemRecordItems()}")
    SystemRecordItems systemRecordItems;

    public TableCountResult getSystemTableItems() {
        int meterNoItems = maintenanceMapper.selectTableCountByTableName("T_METERNO");
        int productItems = maintenanceMapper.selectTableCountByTableName("T_PRODUCTTEST");
        int errValueItems = maintenanceMapper.selectTableCountByTableName("T_ERRVALUETEST");
        int autoErrValueItems = maintenanceMapper.selectTableCountByTableName("T_AUTOERRVALUETEST");
        int tempDataV1Items = maintenanceMapper.selectTableCountByTableName("T_TEMPTESTDATAV1");
        int tempDataV2Items = maintenanceMapper.selectTableCountByTableName("T_TEMPTESTDATAV2");
        int meterInformationItems = maintenanceMapper.selectTableCountByTableName("T_METERINFORMATION");
        int errValueAnalyseItems = maintenanceMapper.selectTableCountByTableName("T_TESTERRVALUEANALYSE");
        TableCountResult tableCountResult = new TableCountResult(
                meterNoItems,
                productItems,
                errValueItems,
                autoErrValueItems,
                tempDataV1Items,
                tempDataV2Items,
                meterInformationItems,
                errValueAnalyseItems
        );
        return tableCountResult;
    }

    public SystemRecordItems getSystemRecordItems() {
        systemRecordItems.setAutoErrValueSavedItems(maintenanceMapper.selectSavedRecordsByTableName("T_AUTOERRVALUETEST"));
        systemRecordItems.setErrValueSavedItems(maintenanceMapper.selectSavedRecordsByTableName("T_ERRVALUETEST"));
        systemRecordItems.setProductSavedItems(maintenanceMapper.selectSavedRecordsByTableName("T_PRODUCTTEST"));
        systemRecordItems.setAutoErrValueUnSavedItems(maintenanceMapper.selectUnSavedRecordsByTableName("T_AUTOERRVALUETEST"));
        systemRecordItems.setErrValueUnSavedItems(maintenanceMapper.selectUnSavedRecordsByTableName("T_ERRVALUETEST"));
        systemRecordItems.setProductUnSavedItems(maintenanceMapper.selectUnSavedRecordsByTableName("T_PRODUCTTEST"));
        return systemRecordItems;
    }
}
