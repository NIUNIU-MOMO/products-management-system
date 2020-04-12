package com.lfy.management.pojo;

public class TableCountResult {
    private int meterNo;
    private int product;
    private int errValue;
    private int autoErrValue;
    private int tempDataV1;
    private int tempDataV2;
    private int meterInformation;
    private int errValueAnalyse;

    @Override
    public String toString() {
        return "TableCountResult{" +
                "meterNo=" + meterNo +
                ", product=" + product +
                ", errValue=" + errValue +
                ", autoErrValue=" + autoErrValue +
                ", tempDataV1=" + tempDataV1 +
                ", tempDataV2=" + tempDataV2 +
                ", meterInformation=" + meterInformation +
                ", errValueAnalyse=" + errValueAnalyse +
                '}';
    }

    public TableCountResult() {
    }

    public TableCountResult(int meterNo, int product, int errValue, int autoErrValue, int tempDataV1, int tempDataV2, int meterInformation, int errValueAnalyse) {
        this.meterNo = meterNo;
        this.product = product;
        this.errValue = errValue;
        this.autoErrValue = autoErrValue;
        this.tempDataV1 = tempDataV1;
        this.tempDataV2 = tempDataV2;
        this.meterInformation = meterInformation;
        this.errValueAnalyse = errValueAnalyse;
    }

    public int getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(int meterNo) {
        this.meterNo = meterNo;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getErrValue() {
        return errValue;
    }

    public void setErrValue(int errValue) {
        this.errValue = errValue;
    }

    public int getAutoErrValue() {
        return autoErrValue;
    }

    public void setAutoErrValue(int autoErrValue) {
        this.autoErrValue = autoErrValue;
    }

    public int getTempDataV1() {
        return tempDataV1;
    }

    public void setTempDataV1(int tempDataV1) {
        this.tempDataV1 = tempDataV1;
    }

    public int getTempDataV2() {
        return tempDataV2;
    }

    public void setTempDataV2(int tempDataV2) {
        this.tempDataV2 = tempDataV2;
    }

    public int getMeterInformation() {
        return meterInformation;
    }

    public void setMeterInformation(int meterInformation) {
        this.meterInformation = meterInformation;
    }

    public int getErrValueAnalyse() {
        return errValueAnalyse;
    }

    public void setErrValueAnalyse(int errValueAnalyse) {
        this.errValueAnalyse = errValueAnalyse;
    }
}
