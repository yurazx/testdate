package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        //testDate();
        testDate2();

    }

    public static void testDate(){


                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String dateInString = "07/13/2013";

                try {

                    Date date = formatter.parse(dateInString);
                    System.out.println(date);
                    System.out.println(formatter.format(date));

                } catch (ParseException e) {
                    e.printStackTrace();
                }
    }
    public static void testDate2(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String date = "31/12/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }
}