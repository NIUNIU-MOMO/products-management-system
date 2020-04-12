package com.lfy.management.entity;


import java.sql.Date;

public class MeterInformation {
    private String meterNo;
    private String testNo;
    private Double qmaxValue;
    private Double qmidValue;
    private Double qminValue;
    private String pressureLoss;
    private String pressurelossResult;
    private String atmosphericPressure;
    private Double temperature;
    private Double relativeHumidity;
    private String qualityInspector;
    private String testTime;
    private String manufacturer;

    @Override
    public String toString() {
        return "MeterInformation{" +
                "meterNo='" + meterNo + '\'' +
                ", testNo='" + testNo + '\'' +
                ", qmaxValue=" + qmaxValue +
                ", qmidValue=" + qmidValue +
                ", qminValue=" + qminValue +
                ", pressureLoss='" + pressureLoss + '\'' +
                ", pressurelossResult='" + pressurelossResult + '\'' +
                ", atmosphericPressure='" + atmosphericPressure + '\'' +
                ", temperature=" + temperature +
                ", relativeHumidity=" + relativeHumidity +
                ", qualityInspector='" + qualityInspector + '\'' +
                ", testTime='" + testTime + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public MeterInformation() {
    }

    public MeterInformation(String meterNo, String testNo, Double qmaxValue, Double qmidValue, Double qminValue, String pressureLoss, String pressurelossResult, String atmosphericPressure, Double temperature, Double relativeHumidity, String qualityInspector, String testTime, String manufacturer) {
        this.meterNo = meterNo;
        this.testNo = testNo;
        this.qmaxValue = qmaxValue;
        this.qmidValue = qmidValue;
        this.qminValue = qminValue;
        this.pressureLoss = pressureLoss;
        this.pressurelossResult = pressurelossResult;
        this.atmosphericPressure = atmosphericPressure;
        this.temperature = temperature;
        this.relativeHumidity = relativeHumidity;
        this.qualityInspector = qualityInspector;
        this.testTime = testTime;
        this.manufacturer = manufacturer;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo;
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

    public String getPressureLoss() {
        return pressureLoss;
    }

    public void setPressureLoss(String pressureLoss) {
        this.pressureLoss = pressureLoss;
    }

    public String getPressurelossResult() {
        return pressurelossResult;
    }

    public void setPressurelossResult(String pressurelossResult) {
        this.pressurelossResult = pressurelossResult;
    }

    public String getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(String atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getQualityInspector() {
        return qualityInspector;
    }

    public void setQualityInspector(String qualityInspector) {
        this.qualityInspector = qualityInspector;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
