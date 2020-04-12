package com.lfy.management.controller;

import com.lfy.management.pojo.SystemRecordItems;
import com.lfy.management.pojo.TableCountResult;
import com.lfy.management.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maintenance/")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @RequestMapping("systemTable_items")
    public String systemTableItems(Model model){
        TableCountResult tableCountResult = maintenanceService.getSystemTableItems();
        model.addAttribute("tableCountResult",tableCountResult);
        return "systemTableItems";
    }

    @RequestMapping("systemRecord_items")
    public String getSystemRecordItems(Model model){
        SystemRecordItems systemRecordItems = maintenanceService.getSystemRecordItems();
        model.addAttribute("systemRecordItems",systemRecordItems);
        return "systemRecordItems";
    }


}
