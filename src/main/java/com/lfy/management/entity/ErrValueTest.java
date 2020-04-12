package com.lfy.management.entity;

import java.sql.Date;

/**检验室检验记录*/
public class ErrValueTest {
    private String testNo;
    private String benchNo;
    private String certificateNo;
    private String meterNo;
    private String insideTightnessNo;
    private Double QmaxValue;
    private Double QmidValue;
    private Double QminValue;
    private String printWheel;
    private String direction;
    private String tightnessResult;
    private String pressureLoss;
    private String pressurelossResult;
    private String finallyResult;
    private String linearResult;
    private String repetitiveResult;
    private String atmosphericPressure;
    private String testTime;
    private Integer meterOrder;
    private String models;
    private String defect;
    private Double temperature;
    private Double relativeHumidity;
    private String qualityInspector;
    private String Manufacturer;
    private String remarks;

    public ErrValueTest() {
    }

    public ErrValueTest(String testNo, String benchNo, String certificateNo, String meterNo, String insideTightnessNo, Double qmaxValue, Double qmidValue, Double qminValue, String printWheel, String direction, String tightnessResult, String pressureLoss, String pressurelossResult, String finallyResult, String linearResult, String repetitiveResult, String atmosphericPressure, String testTime, Integer meterOrder, String models, String defect, Double temperature, Double relativeHumidity, String qualityInspector, String manufacturer, String remarks) {
        this.testNo = testNo;
        this.benchNo = benchNo;
        this.certificateNo = certificateNo;
        this.meterNo = meterNo;
        this.insideTightnessNo = insideTightnessNo;
        QmaxValue = qmaxValue;
        QmidValue = qmidValue;
        QminValue = qminValue;
        this.printWheel = printWheel;
        this.direction = direction;
        this.tightnessResult = tightnessResult;
        this.pressureLoss = pressureLoss;
        this.pressurelossResult = pressurelossResult;
        this.finallyResult = finallyResult;
        this.linearResult = linearResult;
        this.repetitiveResult = repetitiveResult;
        this.atmosphericPressure = atmosphericPressure;
        this.testTime = testTime;
        this.meterOrder = meterOrder;
        this.models = models;
        this.defect = defect;
        this.temperature = temperature;
        this.relativeHumidity = relativeHumidity;
        this.qualityInspector = qualityInspector;
        Manufacturer = manufacturer;
        this.remarks = remarks;
    }

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo;
    }

    public String getBenchNo() {
        return benchNo;
    }

    public void setBenchNo(String benchNo) {
        this.benchNo = benchNo;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getInsideTightnessNo() {
        return insideTightnessNo;
    }

    public void setInsideTightnessNo(String insideTightnessNo) {
        this.insideTightnessNo = insideTightnessNo;
    }

    public Double getQmaxValue() {
        return QmaxValue;
    }

    public void setQmaxValue(Double qmaxValue) {
        QmaxValue = qmaxValue;
    }

    public Double getQmidValue() {
        return QmidValue;
    }

    public void setQmidValue(Double qmidValue) {
        QmidValue = qmidValue;
    }

    public Double getQminValue() {
        return QminValue;
    }

    public void setQminValue(Double qminValue) {
        QminValue = qminValue;
    }

    public String getPrintWheel() {
        return printWheel;
    }

    public void setPrintWheel(String printWheel) {
        this.printWheel = printWheel;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTightnessResult() {
        return tightnessResult;
    }

    public void setTightnessResult(String tightnessResult) {
        this.tightnessResult = tightnessResult;
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

    public String getFinallyResult() {
        return finallyResult;
    }

    public void setFinallyResult(String finallyResult) {
        this.finallyResult = finallyResult;
    }

    public String getLinearResult() {
        return linearResult;
    }

    public void setLinearResult(String linearResult) {
        this.linearResult = linearResult;
    }

    public String getRepetitiveResult() {
        return repetitiveResult;
    }

    public void setRepetitiveResult(String repetitiveResult) {
        this.repetitiveResult = repetitiveResult;
    }

    public String getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(String atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public Integer getMeterOrder() {
        return meterOrder;
    }

    public void setMeterOrder(Integer meterOrder) {
        this.meterOrder = meterOrder;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getDefect() {
        return defect;
    }

    public void setDefect(String defect) {
        this.defect = defect;
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

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ErrValueTest{" +
                "testNo='" + testNo + '\'' +
                ", benchNo='" + benchNo + '\'' +
                ", certificateNo='" + certificateNo + '\'' +
                ", meterNo='" + meterNo + '\'' +
                ", insideTightnessNo='" + insideTightnessNo + '\'' +
                ", QmaxValue=" + QmaxValue +
                ", QmidValue=" + QmidValue +
                ", QminValue=" + QminValue +
                ", printWheel='" + printWheel + '\'' +
                ", direction='" + direction + '\'' +
                ", tightnessResult='" + tightnessResult + '\'' +
                ", pressureLoss='" + pressureLoss + '\'' +
                ", pressurelossResult='" + pressurelossResult + '\'' +
                ", finallyResult='" + finallyResult + '\'' +
                ", linearResult='" + linearResult + '\'' +
                ", repetitiveResult='" + repetitiveResult + '\'' +
                ", atmosphericPressure='" + atmosphericPressure + '\'' +
                ", testTime='" + testTime + '\'' +
                ", meterOrder=" + meterOrder +
                ", models='" + models + '\'' +
                ", defect='" + defect + '\'' +
                ", temperature=" + temperature +
                ", relativeHumidity=" + relativeHumidity +
                ", qualityInspector='" + qualityInspector + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
