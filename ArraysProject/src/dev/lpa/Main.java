package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // size of an array cannot be changed... in this example
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        //array initializer only used in declaration statement only
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // anonymous array as no length specified
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        // newArray = {1, 2, 3, 4, 5} INVALID
        newArray = new int[] {1, 2, 3, 4, 5}; //VALID

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        // set to default type values when initializer used for each type
        int[] newArray2;
        newArray2 = new int[5];
        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = newArray2.length - i;
        }
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + " ");
        }
        System.out.println();

        // Foreach loop designed for walking through arrays
        // for (declaration : collection)
        for (int element : newArray){
            System.out.print(element + " ");
        }

        // array utils helper
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        // one way to have an array of many types (certainly not best practice)....
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));



    }
}
