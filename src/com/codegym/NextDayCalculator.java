package com.codegym;

public class NextDayCalculator {

    public static String NextDay(int day,int month,int year){
        if (day == getLastDayOfMonth(month,year)){
            if (month == 12){
                year++;
                day = 1;
                month = 1;
            }
            day = 1;
            month = 1;
        }else {
            day++;
        }
        return (day +"/"+month+"/"+year);
    }

    private static int inLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            return 29;
        } else {
            return 28;
        }
    }

    private static int getLastDayOfMonth(int month, int year){
        int lastDayOfMonth = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
            case 2:
                lastDayOfMonth = inLeapYear(year);
        }
        return lastDayOfMonth;
    }

}
