package com.lfy.management.entity;

public class MeterNo {

    private String meterNo;

    @Override
    public String toString() {
        return "MeterNo{" +
                "meterNo='" + meterNo + '\'' +
                '}';
    }

    public MeterNo() {
    }

    public MeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }
}
