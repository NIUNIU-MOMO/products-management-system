package com.lfy.management.entity;

import java.sql.Date;


/**成品检验记录*/
public class ProductTest {
    private String testNo;
    private String meterNo;
    private String models;
    private String meterVersion;
    private Double importAmount;
    private Double initialValue;
    private Double terminalValue;
    private Double errorValue;
    private String voltage;
    private String outage;
    private String controlValve;
    private String remains;
    private String IC;
    private String dataMemories;
    private String controlLongdistance;
    private String finallyResult;
    private String commDescribe;
    private String unqualifiedDescribe;
    private String qualityInspector;
    private String testTime;
    private String direction;
    private String IMEI;
    private String SIM;
    private String remarks;

    @Override
    public String toString() {
        return "ProductTest{" +
                "testNo='" + testNo + '\'' +
                ", meterNo='" + meterNo + '\'' +
                ", models='" + models + '\'' +
                ", meterVersion='" + meterVersion + '\'' +
                ", importAmount=" + importAmount +
                ", initialValue=" + initialValue +
                ", terminalValue=" + terminalValue +
                ", errorValue=" + errorValue +
                ", voltage='" + voltage + '\'' +
                ", outage='" + outage + '\'' +
                ", controlValve='" + controlValve + '\'' +
                ", remains='" + remains + '\'' +
                ", IC='" + IC + '\'' +
                ", dataMemories='" + dataMemories + '\'' +
                ", controlLongdistance='" + controlLongdistance + '\'' +
                ", finallyResult='" + finallyResult + '\'' +
                ", commDescribe='" + commDescribe + '\'' +
                ", unqualifiedDescribe='" + unqualifiedDescribe + '\'' +
                ", qualityInspector='" + qualityInspector + '\'' +
                ", testTime='" + testTime + '\'' +
                ", direction='" + direction + '\'' +
                ", IMEI='" + IMEI + '\'' +
                ", SIM='" + SIM + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public ProductTest() {
    }

    public ProductTest(String testNo, String meterNo, String models, String meterVersion, Double importAmount, Double initialValue, Double terminalValue, Double errorValue, String voltage, String outage, String controlValve, String remains, String IC, String dataMemories, String controlLongdistance, String finallyResult, String commDescribe, String unqualifiedDescribe, String qualityInspector, String testTime, String direction, String IMEI, String SIM, String remarks) {
        this.testNo = testNo;
        this.meterNo = meterNo;
        this.models = models;
        this.meterVersion = meterVersion;
        this.importAmount = importAmount;
        this.initialValue = initialValue;
        this.terminalValue = terminalValue;
        this.errorValue = errorValue;
        this.voltage = voltage;
        this.outage = outage;
        this.controlValve = controlValve;
        this.remains = remains;
        this.IC = IC;
        this.dataMemories = dataMemories;
        this.controlLongdistance = controlLongdistance;
        this.finallyResult = finallyResult;
        this.commDescribe = commDescribe;
        this.unqualifiedDescribe = unqualifiedDescribe;
        this.qualityInspector = qualityInspector;
        this.testTime = testTime;
        this.direction = direction;
        this.IMEI = IMEI;
        this.SIM = SIM;
        this.remarks = remarks;
    }

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getMeterVersion() {
        return meterVersion;
    }

    public void setMeterVersion(String meterVersion) {
        this.meterVersion = meterVersion;
    }

    public Double getImportAmount() {
        return importAmount;
    }

    public void setImportAmount(Double importAmount) {
        this.importAmount = importAmount;
    }

    public Double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Double initialValue) {
        this.initialValue = initialValue;
    }

    public Double getTerminalValue() {
        return terminalValue;
    }

    public void setTerminalValue(Double terminalValue) {
        this.terminalValue = terminalValue;
    }

    public Double getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Double errorValue) {
        this.errorValue = errorValue;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getOutage() {
        return outage;
    }

    public void setOutage(String outage) {
        this.outage = outage;
    }

    public String getControlValve() {
        return controlValve;
    }

    public void setControlValve(String controlValve) {
        this.controlValve = controlValve;
    }

    public String getRemains() {
        return remains;
    }

    public void setRemains(String remains) {
        this.remains = remains;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getDataMemories() {
        return dataMemories;
    }

    public void setDataMemories(String dataMemories) {
        this.dataMemories = dataMemories;
    }

    public String getControlLongdistance() {
        return controlLongdistance;
    }

    public void setControlLongdistance(String controlLongdistance) {
        this.controlLongdistance = controlLongdistance;
    }

    public String getFinallyResult() {
        return finallyResult;
    }

    public void setFinallyResult(String finallyResult) {
        this.finallyResult = finallyResult;
    }

    public String getCommDescribe() {
        return commDescribe;
    }

    public void setCommDescribe(String commDescribe) {
        this.commDescribe = commDescribe;
    }

    public String getUnqualifiedDescribe() {
        return unqualifiedDescribe;
    }

    public void setUnqualifiedDescribe(String unqualifiedDescribe) {
        this.unqualifiedDescribe = unqualifiedDescribe;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
