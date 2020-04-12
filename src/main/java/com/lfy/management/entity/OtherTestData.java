package com.lfy.management.entity;

public class OtherTestData {
    private String meterNo;
    private Double qmaxValue;
    private Double qmidValue;

    public OtherTestData() {
    }

    public OtherTestData(String meterNo, Double qmaxValue, Double qmidValue) {
        this.meterNo = meterNo;
        this.qmaxValue = qmaxValue;
        this.qmidValue = qmidValue;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public Double getQmaxValue() {
        return qmaxValue;
    }

    public void setQmaxValue(Double qmaxValue) {
        this.qmaxValue = qmaxValue;
    }

    public Double getQmidValue() {
        return qmidValue;
    }

    public void setQmidValue(Double qmidValue) {
        this.qmidValue = qmidValue;
    }

    @Override
    public String toString() {
        return "OtherTestData{" +
                "meterNo='" + meterNo + '\'' +
                ", qmaxValue=" + qmaxValue +
                ", qmidValue=" + qmidValue +
                '}';
    }
}
