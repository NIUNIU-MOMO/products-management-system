package com.lfy.management.entity;

public class TempTestDataV2 {
    private String meterNo;
    private String testPoint;
    private Double errValue;

    public TempTestDataV2() {
    }

    public TempTestDataV2(String meterNo, String testPoint, Double errValue) {
        this.meterNo = meterNo;
        this.testPoint = testPoint;
        this.errValue = errValue;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getTestPoint() {
        return testPoint;
    }

    public void setTestPoint(String testPoint) {
        this.testPoint = testPoint;
    }

    public Double getErrValue() {
        return errValue;
    }

    public void setErrValue(Double errValue) {
        this.errValue = errValue;
    }

    @Override
    public String toString() {
        return "TempTestDataV2{" +
                "meterNo='" + meterNo + '\'' +
                ", testPoint='" + testPoint + '\'' +
                ", errValue=" + errValue +
                '}';
    }
}
