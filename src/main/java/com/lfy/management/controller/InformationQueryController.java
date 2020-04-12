package com.lfy.management.controller;

import com.lfy.management.service.InformationQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/query/")
public class InformationQueryController {

    @Autowired
    private InformationQueryService informationQueryService;


    @RequestMapping("singleproduct_information")
    public String singleProductInformation(){

        return "querySingleProductInformation";
    }

    @RequestMapping("products_information")
    public String productsInformation(Model model){
        int meterNoItems = informationQueryService.queryMeterNoItems();
        model.addAttribute("meterNoItems",meterNoItems);
        return "queryProductsInformation";
    }

    @RequestMapping("analyse_result")
    public String analyseResult(Model model){
        int tempTestDataV1Items = informationQueryService.queryTempTestDataV1Items();
        int tempTestDataV2Items = informationQueryService.queryTempTestDataV2Items();
        model.addAttribute("tempTestDataV1Items",tempTestDataV1Items);
        model.addAttribute("tempTestDataV2Items",tempTestDataV2Items);
        return "queryAnalyseResult";
    }


}
