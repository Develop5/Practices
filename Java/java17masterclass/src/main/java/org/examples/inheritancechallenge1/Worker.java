package main.java.org.examples.inheritancechallenge1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Worker {
    private String name;
    private String birthday;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birthday, String endDate) {
        this.name = name;
        this.birthday = birthday;
        this.endDate = endDate;
    }


    public int getAge() {
        Calendar date = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthday));
        int d2 = Integer.parseInt(formatter.format(date));
        System.out.println("--- Today is: " + date.toString());
        return ((d2-d1)/10000);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
