package com.lfy.management.pojo;

public class SystemRecordItems {
    private int productSavedItems;
    private int productUnSavedItems;
    private int errValueSavedItems;
    private int errValueUnSavedItems;
    private int autoErrValueSavedItems;
    private int autoErrValueUnSavedItems;

    @Override
    public String toString() {
        return "SystemRecordItems{" +
                "productSavedItems=" + productSavedItems +
                ", productUnSavedItems=" + productUnSavedItems +
                ", errValueSavedItems=" + errValueSavedItems +
                ", errValueUnSavedItems=" + errValueUnSavedItems +
                ", autoErrValueSavedItems=" + autoErrValueSavedItems +
                ", autoErrValueUnSavedItems=" + autoErrValueUnSavedItems +
                '}';
    }

    public SystemRecordItems() {
    }

    public SystemRecordItems(int productSavedItems, int productUnSavedItems, int errValueSavedItems, int errValueUnSavedItems, int autoErrValueSavedItems, int autoErrValueUnSavedItems) {
        this.productSavedItems = productSavedItems;
        this.productUnSavedItems = productUnSavedItems;
        this.errValueSavedItems = errValueSavedItems;
        this.errValueUnSavedItems = errValueUnSavedItems;
        this.autoErrValueSavedItems = autoErrValueSavedItems;
        this.autoErrValueUnSavedItems = autoErrValueUnSavedItems;
    }

    public int getProductSavedItems() {
        return productSavedItems;
    }

    public void setProductSavedItems(int productSavedItems) {
        this.productSavedItems = productSavedItems;
    }

    public int getProductUnSavedItems() {
        return productUnSavedItems;
    }

    public void setProductUnSavedItems(int productUnSavedItems) {
        this.productUnSavedItems = productUnSavedItems;
    }

    public int getErrValueSavedItems() {
        return errValueSavedItems;
    }

    public void setErrValueSavedItems(int errValueSavedItems) {
        this.errValueSavedItems = errValueSavedItems;
    }

    public int getErrValueUnSavedItems() {
        return errValueUnSavedItems;
    }

    public void setErrValueUnSavedItems(int errValueUnSavedItems) {
        this.errValueUnSavedItems = errValueUnSavedItems;
    }

    public int getAutoErrValueSavedItems() {
        return autoErrValueSavedItems;
    }

    public void setAutoErrValueSavedItems(int autoErrValueSavedItems) {
        this.autoErrValueSavedItems = autoErrValueSavedItems;
    }

    public int getAutoErrValueUnSavedItems() {
        return autoErrValueUnSavedItems;
    }

    public void setAutoErrValueUnSavedItems(int autoErrValueUnSavedItems) {
        this.autoErrValueUnSavedItems = autoErrValueUnSavedItems;
    }
}
