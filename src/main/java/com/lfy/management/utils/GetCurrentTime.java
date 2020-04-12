package com.lfy.management.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTime {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    public String getCurrentTime() {
        Date date = null;
        try {
            date = new Date();
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (date != null) {
                date = null;
            }
        }
    }

}
