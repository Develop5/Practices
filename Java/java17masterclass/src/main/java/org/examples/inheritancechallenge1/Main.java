package main.java.org.examples.inheritancechallenge1;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim",
                "11/11/1985",
                "01/012020");
        System.out.println("\n--------------------------------");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        System.out.println("\n--------------------------------");
        Employee joe = new Employee("joe",
                "11/11/1990",
                "03/03/2020");
        System.out.println(joe);
        /*
        SalariedEmployee pedro66 = new SalariedEmployee("pedro66",
                "3/8/1998",
                "5/9/2024",
                357938453,
                "6/6/2016",
                170000,
                false);
        doWorkerstuff(pedro66);

        HourlyEmployee pablo44 = new HourlyEmployee("pablo44",
                "6/12/2010",
                "6/6/2016",
                2222222,
                "4/4/2014",
                500);
        doWorkerstuff(pablo44);

         */
    }


    public static void doWorkerstuff(Employee employee){
        System.out.println("My age: " + employee.getAge());
        System.out.println("Collect pay: " + employee.collectPay());
        employee.terminate(employee.endDate);
        System.out.println("_ _ _ _");
    }
}
