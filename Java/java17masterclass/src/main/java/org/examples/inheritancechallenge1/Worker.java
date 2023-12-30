package main.java.org.examples.inheritancechallenge1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Worker {
    private String name;
    private String birthday;
    private String endDate;

    public int getIndividualAge() {

        Calendar date = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthday));
        int d2 = Integer.parseInt(formatter.format(date));
        int age = (d2-d1)/10000;
        return age;


    }

}
