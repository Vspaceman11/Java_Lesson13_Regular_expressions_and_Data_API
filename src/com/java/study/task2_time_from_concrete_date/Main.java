package com.java.study.task2_time_from_concrete_date;

import java.time.*;

public class Main {
    public static void main(String[] args) {
    LocalDate datePaste = LocalDate.of(2000,8,2);
    LocalDate dateNow = LocalDate.now();
        System.out.println(timeFromDate(datePaste,dateNow));
    }
    public static String timeFromDate(LocalDate datePast, LocalDate dateNow){
        return "Вам виповнилось: " + Period.between(datePast,dateNow).getYears() + " роки" +
                ", " + Period.between(datePast,dateNow).getMonths() + " місяців" +
                ", " + Period.between(datePast,dateNow).getDays() + " дні" +
                ". ";
    }
}
