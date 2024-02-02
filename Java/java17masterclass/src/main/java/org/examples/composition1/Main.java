package org.examples.composition1;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "2,44");
        PersonalComputer thePC = new PersonalComputer(
                "2208",
                "Dell",
                theCase,
                theMonitor,
                theMotherboard);

        /*
        // We built this personal computer by passing objects to the constructor
        // like a typical assembling of a computer
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();

         */

        thePC.powerUp();
        // This way, this code does not need to interact
        // with PersonalComputer parts, to get the PC to do something
        // The PersonalComputer is managing and looking after all its parts
        // and uses composition to achieve that.


    }
}
