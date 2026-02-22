package org.examples.inheritancechallenge1;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim",
                "11/11/1985",
                "01/012020");
        System.out.println("\n--------------------------------");
        System.out.println(tim);
        //System.out.println("Age = " + tim.getAge());
        //System.out.println("Pay = " + tim.collectPay());

        System.out.println("\n--------------------------------");
        SalariedEmployee joe = new SalariedEmployee("Joe",
                "11/11/1990",
                "03/03/2020",
                35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        System.out.println("\n--------------------------------");
        HourlyEmployee mary = new HourlyEmployee("Mary",
                "05/05/1970",
                "03/03/21",
                15);
        System.out.println(mary);
        System.out.println("JMary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }

}
