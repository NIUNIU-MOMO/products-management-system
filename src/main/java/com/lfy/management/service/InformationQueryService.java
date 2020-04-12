package com.lfy.management.service;

import com.lfy.management.mapper.InformationQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationQueryService {

    @Autowired(required = false)
    private InformationQueryMapper informationQueryMapper;

    public int queryMeterNoItems() {
        return informationQueryMapper.selectCountMeterNo();
    }

    public int queryTempTestDataV1Items() {

        return informationQueryMapper.selectCountTempTestDataV1();
    }

    public int queryTempTestDataV2Items() {

        return informationQueryMapper.selectCountTempTestDataV2();
    }
}
