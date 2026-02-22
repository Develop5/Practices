package org.examples.composition1;

public class ComputerCase extends Product{
    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
