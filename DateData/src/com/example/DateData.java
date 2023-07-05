package com.example;


import java.util.Calendar;

public class DateData {
    private String dateData = null;
    public  void setDateData(String yyyymmdd) {
        dateData = yyyymmdd;
    }

    public String getToday(){
        Calendar cal = Calendar.getInstance();
        return String.format("%02d", cal.get(Calendar.YEAR)) +
                String.format("%02d", cal.get(Calendar.MONTH)) +
                String.format("%02d", cal.get(Calendar.DAY_OF_MONTH));
    }
    public boolean isToday(String yyyymmdd){
        if(yyyymmdd == (getToday())){
            return true;
        }
        return false;
    }

    public boolean isLeapYear(String yyyymmdd){
        return isLeapYear(Integer.parseInt(yyyymmdd.substring(0,4)));
    }
    public boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else return year % 4 == 0;
    }

    public String getDateData() {
        return dateData;
    }
}