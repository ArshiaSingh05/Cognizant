package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    private SimpleDateFormat dateFormat;

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void displayDate() {
        System.out.println("Current Date : "
                + dateFormat.format(new Date()));
    }
}