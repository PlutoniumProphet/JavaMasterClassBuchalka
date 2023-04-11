public class Main {
    public static void main(String[] args) {

// consider Google Java Style Guide

        int myVariable = 50; // valid whitespace and ignored by Java

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVar = 50;
        myVariable--;
        System.out.println("myVariable=" + myVariable); // valid but discouraged

        if (myVariable == 0) {
            System.out.println("It is now zero");
        }
    }
}
