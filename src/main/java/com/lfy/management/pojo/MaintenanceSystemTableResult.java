package com.lfy.management.pojo;

public class MaintenanceSystemTableResult {
    private String maintenanceTesult;
    private int deleteItems;
    private int remainItems;

    @Override
    public String toString() {
        return "MaintenanceSystemTableResult{" +
                "maintenanceTesult='" + maintenanceTesult + '\'' +
                ", deleteItems=" + deleteItems +
                ", remainItems=" + remainItems +
                '}';
    }

    public MaintenanceSystemTableResult() {
    }

    public MaintenanceSystemTableResult(String maintenanceTesult, int deleteItems, int remainItems) {
        this.maintenanceTesult = maintenanceTesult;
        this.deleteItems = deleteItems;
        this.remainItems = remainItems;
    }

    public String getMaintenanceTesult() {
        return maintenanceTesult;
    }

    public void setMaintenanceTesult(String maintenanceTesult) {
        this.maintenanceTesult = maintenanceTesult;
    }

    public int getDeleteItems() {
        return deleteItems;
    }

    public void setDeleteItems(int deleteItems) {
        this.deleteItems = deleteItems;
    }

    public int getRemainItems() {
        return remainItems;
    }

    public void setRemainItems(int remainItems) {
        this.remainItems = remainItems;
    }
}
