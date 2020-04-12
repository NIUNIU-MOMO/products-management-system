package com.lfy.management.entity;

import java.sql.Date;

/**自动线检验记录*/
public class AutoErrValueTest {
    private String firstorSecond;
    private String equipNum;
    private String stationNum;
    private String transTime;
    private String serialNum;
    private String flowPoint;
    private String times;
    private String flowVolumn;
    private Double errorValue;
    private String pressureLossValue;
    private String atmosphericPressure;
    private String temperature;
    private String relativeHumidity;
    private String diffValue;
    private String startTime;
    private String endTime;
    private String testNo;

    @Override
    public String toString() {
        return "AutoErrValueTest{" +
                "firstorSecond='" + firstorSecond + '\'' +
                ", equipNum='" + equipNum + '\'' +
                ", stationNum='" + stationNum + '\'' +
                ", transTime='" + transTime + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", flowPoint='" + flowPoint + '\'' +
                ", times='" + times + '\'' +
                ", flowVolumn='" + flowVolumn + '\'' +
                ", errorValue=" + errorValue +
                ", pressureLossValue='" + pressureLossValue + '\'' +
                ", atmosphericPressure='" + atmosphericPressure + '\'' +
                ", temperature='" + temperature + '\'' +
                ", relativeHumidity='" + relativeHumidity + '\'' +
                ", diffValue='" + diffValue + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", testNo='" + testNo + '\'' +
                '}';
    }

    public AutoErrValueTest() {
    }

    public AutoErrValueTest(String firstorSecond, String equipNum, String stationNum, String transTime, String serialNum, String flowPoint, String times, String flowVolumn, Double errorValue, String pressureLossValue, String atmosphericPressure, String temperature, String relativeHumidity, String diffValue, String startTime, String endTime, String testNo) {
        this.firstorSecond = firstorSecond;
        this.equipNum = equipNum;
        this.stationNum = stationNum;
        this.transTime = transTime;
        this.serialNum = serialNum;
        this.flowPoint = flowPoint;
        this.times = times;
        this.flowVolumn = flowVolumn;
        this.errorValue = errorValue;
        this.pressureLossValue = pressureLossValue;
        this.atmosphericPressure = atmosphericPressure;
        this.temperature = temperature;
        this.relativeHumidity = relativeHumidity;
        this.diffValue = diffValue;
        this.startTime = startTime;
        this.endTime = endTime;
        this.testNo = testNo;
    }

    public String getFirstorSecond() {
        return firstorSecond;
    }

    public void setFirstorSecond(String firstorSecond) {
        this.firstorSecond = firstorSecond;
    }

    public String getEquipNum() {
        return equipNum;
    }

    public void setEquipNum(String equipNum) {
        this.equipNum = equipNum;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getFlowPoint() {
        return flowPoint;
    }

    public void setFlowPoint(String flowPoint) {
        this.flowPoint = flowPoint;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getFlowVolumn() {
        return flowVolumn;
    }

    public void setFlowVolumn(String flowVolumn) {
        this.flowVolumn = flowVolumn;
    }

    public Double getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Double errorValue) {
        this.errorValue = errorValue;
    }

    public String getPressureLossValue() {
        return pressureLossValue;
    }

    public void setPressureLossValue(String pressureLossValue) {
        this.pressureLossValue = pressureLossValue;
    }

    public String getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(String atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getDiffValue() {
        return diffValue;
    }

    public void setDiffValue(String diffValue) {
        this.diffValue = diffValue;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo;
    }
}
