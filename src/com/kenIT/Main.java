package com.kenIT;

public class Main {

    static ValidateNameOfClass validateNameOfClass = new ValidateNameOfClass();
    public static final String[] validName = new String[] {"C0318G"};
    public static final String[] invalidName = new String[] { "M0318G", "P0323A"};
    public static void main(String[] args) {

        for (String name :
             validName) {
            System.out.println("Name is: " + name +" " +validateNameOfClass.validate(name));
        }
        for (String name:
             invalidName) {
            System.out.println("Name is: " + name +" "+ validateNameOfClass.validate(name));
        }
    }
}
