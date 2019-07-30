package com.grinfelds;

public class Main {

    private double firstNumber =0.0 ;
    private double secondNumber = 0.0;
    private String firstName = "Sandy";
    private String lastName = "Rocks";
    private int age = 0;


    public static void main(String[] args) {

        Main person = new Main();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        person.setAge(-5);
        System.out.println(person.getAge());
        person.setAge(5);
        System.out.println(person.getAge());

    }

    //e29

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

    //e30

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100){
           this.age = 0;
        } else {
            this.age = age;
        }
    }
    public boolean isTeen() {
        if (age > 12 && age <20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if(firstName.isEmpty()){
            return lastName;
        }
        return firstName + " " + lastName;
    }

}
