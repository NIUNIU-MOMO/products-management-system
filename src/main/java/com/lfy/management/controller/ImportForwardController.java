package com.lfy.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forward/")
public class ImportForwardController {

    @RequestMapping("ErrValueTest")
    public String errValueTest(){

        return "importErrValueTest";
    }

    @RequestMapping("AutoErrValueTest")
    public String autoErrValueTest(){

        return "importAutoErrValueTest";
    }

    @RequestMapping("ProductTest")
    public String productTest(){

        return "importProductTest";
    }

    @RequestMapping("TempTestDataV1")
    public String tempTestData(){

        return "importTempTestDataV1";
    }

    @RequestMapping("TempTestDataV2")
    public String tempTestDataV2(){

        return "importTempTestDataV2";
    }

    @RequestMapping("MeterNo")
    public String meterNo(){

        return "importMeterNo";
    }

}
