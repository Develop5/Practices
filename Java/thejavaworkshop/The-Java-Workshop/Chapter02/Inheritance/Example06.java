package Inheritance;

class Example06 {
    public static void main(String[] args) {
        Tablet myTab1 = new Tablet();
        System.out.println("\n1st case:");
        myTab1.whatIsIt();

        Computer myTab2 = new Tablet();
        System.out.println("\n2nd case:");
        myTab2.whatIsIt();
    }
}
