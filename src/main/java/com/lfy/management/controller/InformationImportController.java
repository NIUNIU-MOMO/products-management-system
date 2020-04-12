package com.lfy.management.controller;

import com.lfy.management.pojo.ImportResult;
import com.lfy.management.service.InformationImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/import/")
public class InformationImportController {

    @Autowired
    private InformationImportService informationImportService;

    @RequestMapping("MeterNoFile")
    public String MeterNoFile(MultipartFile meterNoFile, Model model){
        ImportResult importMeterNOFileResult = informationImportService.importMeterNoFile(meterNoFile);
        model.addAttribute("importMeterNOFileResult",importMeterNOFileResult);
        return "resultImportMeterNo";
    }

    @RequestMapping("errValueTestFile")
    public String errValueTestFile(MultipartFile errValueTestFile, Model model){
//        System.out.println(errValueTestFile.getOriginalFilename());
        ImportResult importErrValueTestFileResult = informationImportService.importErrValueTestFile(errValueTestFile);
        model.addAttribute("importErrValueTestFileResult",importErrValueTestFileResult);
        return "resultImportErrValueTest";
    }

    @RequestMapping("autoErrValueTestFile")
    public String autoErrValueTestFile(MultipartFile autoErrValueTestFile, Model model){
//        System.out.println(autoErrValueTestFile.getOriginalFilename());
        ImportResult importAutoErrValueTestFileResult = informationImportService.importAutoErrValueTestFile(autoErrValueTestFile);
        model.addAttribute("importAutoErrValueTestFileResult",importAutoErrValueTestFileResult);
        return "resultImportAutoErrValueTest";
    }

    @RequestMapping("productTestFile")
    public String productTestFile(MultipartFile productTestFile, Model model){
//        System.out.println(productTestFile.getOriginalFilename());
        ImportResult importProductTestFileResult = informationImportService.importProductTestFile(productTestFile);
        model.addAttribute("importProductTestFileResult",importProductTestFileResult);
        return "resultImportProductTest";
    }

    @RequestMapping("tempTestDataV1File")
    public String tempTestDataV1File(MultipartFile tempTestDataV1File, Model model){
//        System.out.println(tempTestDataV1File.getOriginalFilename());
        ImportResult importTempTestDataV1FileResult = informationImportService.importTempTestDataV1File(tempTestDataV1File);
        model.addAttribute("importTempTestDataV1FileResult",importTempTestDataV1FileResult);
        return "resultImportTempTestDataV1";
    }

    @RequestMapping("tempTestDataV2File")
    public String tempTestDataV2File(MultipartFile tempTestDataV2File, Model model){
//        System.out.println(tempTestDataV2File.getOriginalFilename());
        ImportResult importTempTestDataV2FileResult = informationImportService.importTempTestDataV2File(tempTestDataV2File);
        model.addAttribute("importTempTestDataV2FileResult",importTempTestDataV2FileResult);
        return "resultImportTempTestDataV2";
    }




}
