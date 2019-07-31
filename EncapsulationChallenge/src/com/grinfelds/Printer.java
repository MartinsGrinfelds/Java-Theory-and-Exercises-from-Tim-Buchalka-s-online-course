package com.grinfelds;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel > 0 && tonerAmount<= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }


    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplexPrinter){
            pagesToPrint /=2;
            System.out.println("Duplex mode");
        }
        this.pagesPrinted +=pagesToPrint;
        return pagesToPrint;

    }

}
