package com.grinfelds;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary +=imaginary;
    }

    public void add(ComplexNumber myNum){

        add(myNum.real,myNum.imaginary);

    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -=imaginary;
    }

    public void subtract(ComplexNumber myNum){

        subtract(myNum.real,myNum.imaginary);

    }
}
