package main.java.org.examples.composition1;

public class PersonalComputer extends Product{
    // Here composition starts. PersonalComputaer HAS A: computercase, monitor, motherboard
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model,
                            String manufacturer,
                            ComputerCase computerCase,
                            Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    /*
    // We are hiding these methods now to create the needed methods in PersonalComputer
    // because we do not want anyone else to be able to access these elements directly
    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

     */

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

}
