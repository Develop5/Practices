package org.examples.autoboxingAndUnboxing;

public class Main1 {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);             // preferred but unnecessary
        //Integer deprecatedBoxing = new Integer(15);     // deprecated since JDK9
        int unboxedInt = boxedInt.intValue();                 // unnecessary

        // Autoboxing
        Integer autoBoxed = 15;                 // Automatically boxing
        int autoUnboxed = autoBoxed;
        System.out.println("\n" + "_".repeat(50));
        System.out.println(autoBoxed.getClass().getName());
        // System.out.println(autoUnBoxed.getClass().getName());    //Compile errors, as it is not a class

        // Nothing needs to be printed
        // Just to show how to box and unbox
        Double resultBoxed = getLiteralDoublePrimitive();
        double resulUnboxed = getDoubleObject();

        System.out.println("\n" + "_".repeat(50));
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
