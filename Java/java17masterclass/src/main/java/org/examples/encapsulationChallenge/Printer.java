package org.examples.encapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        // pagesPrinted not included in any constructor as it will be managed by this class
        // and needs to be initialized always with 0 when a printer is created
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {

        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
