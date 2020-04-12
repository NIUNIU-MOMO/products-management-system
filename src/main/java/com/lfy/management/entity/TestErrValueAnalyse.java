package com.lfy.management.entity;


/**数据分析结果*/
public class TestErrValueAnalyse {
    private String meterNo;
    private String testNo;
    private Double qmaxQc;
    private Double qmidQc;
    private Double qmaxJbs;
    private Double qmidJbs;
    private Double qmaxErr;
    private Double qmidErr;

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

    public Double getQmaxQc() {
        return qmaxQc;
    }

    public void setQmaxQc(Double qmaxQc) {
        this.qmaxQc = qmaxQc;
    }

    public Double getQmidQc() {
        return qmidQc;
    }

    public void setQmidQc(Double qmidQc) {
        this.qmidQc = qmidQc;
    }

    public Double getQmaxJbs() {
        return qmaxJbs;
    }

    public void setQmaxJbs(Double qmaxJbs) {
        this.qmaxJbs = qmaxJbs;
    }

    public Double getQmidJbs() {
        return qmidJbs;
    }

    public void setQmidJbs(Double qmidJbs) {
        this.qmidJbs = qmidJbs;
    }

    public Double getQmaxErr() {
        return qmaxErr;
    }

    public void setQmaxErr(Double qmaxErr) {
        this.qmaxErr = qmaxErr;
    }

    public Double getQmidErr() {
        return qmidErr;
    }

    public void setQmidErr(Double qmidErr) {
        this.qmidErr = qmidErr;
    }

    public TestErrValueAnalyse() {
    }

    public TestErrValueAnalyse(String meterNo, String testNo, Double qmaxQc, Double qmidQc, Double qmaxJbs, Double qmidJbs, Double qmaxErr, Double qmidErr) {
        this.meterNo = meterNo;
        this.testNo = testNo;
        this.qmaxQc = qmaxQc;
        this.qmidQc = qmidQc;
        this.qmaxJbs = qmaxJbs;
        this.qmidJbs = qmidJbs;
        this.qmaxErr = qmaxErr;
        this.qmidErr = qmidErr;
    }

    @Override
    public String toString() {
        return "TestErrValueAnalyse{" +
                "meterNo='" + meterNo + '\'' +
                ", testNo='" + testNo + '\'' +
                ", qmaxQc=" + qmaxQc +
                ", qmidQc=" + qmidQc +
                ", qmaxJbs=" + qmaxJbs +
                ", qmidJbs=" + qmidJbs +
                ", qmaxErr=" + qmaxErr +
                ", qmidErr=" + qmidErr +
                '}';
    }
}
