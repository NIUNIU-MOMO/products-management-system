package com.lfy.management.entity;

public class TempTestDataV1 {
    private String meterNo;
    private Double qmaxValue;
    private Double qmidValue;
    private Double qminValue;

    @Override
    public String toString() {
        return "TempTestData{" +
                "meterNo='" + meterNo + '\'' +
                ", qmaxValue=" + qmaxValue +
                ", qmidValue=" + qmidValue +
                ", qminValue=" + qminValue +
                '}';
    }

    public TempTestDataV1() {
    }

    public TempTestDataV1(String meterNo, Double qmaxValue, Double qmidValue, Double qminValue) {
        this.meterNo = meterNo;
        this.qmaxValue = qmaxValue;
        this.qmidValue = qmidValue;
        this.qminValue = qminValue;
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

    public Double getQminValue() {
        return qminValue;
    }

    public void setQminValue(Double qminValue) {
        this.qminValue = qminValue;
    }
}
