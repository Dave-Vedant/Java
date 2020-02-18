package academy.learnprogramming;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args){

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue +1));

        //int myMaxIntTest = 2147483648; (BigNumberError)
        int myMaxIntTest = 2_147_483_647; // readable way for big number

        // Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        //long myLongValue = 100; its short value so we need to tell system that its long value so...
        //declaration
        long myLongValue = 100L; //small l is look like 1 so better to use capital one.
        long biglonginteralValue = 2_147_483_647_989_879_748L;
        System.out.println(biglonginteralValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2); // casting, for define num as byte instead of int
                                                        // which java understood and not getting output for byte myNewByteValue.
        short myNewShortValue = (short) (myMinShortValue/2);

        //challenge
        byte NumberA = 100;
        short NumberB = 23456;
        int NumberC = 83403209;
        long NumberD = 50000L + (10L * (NumberA + NumberB + NumberC));
        System.out.println("Answer: " + NumberD);
        System.out.println("Hurray!");

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);
        //declaration
        int myInValue = 5;
        double myDoubleValue = 5.25d; //other way, but not recommended :);
        float myFloatValue = 5.25F;

        //Challenge: convert given number from pound to kilograms...
        double numberOfPound = 200D;
        double convertToKilograms = numberOfPound * 0.45359237d;
        System.out.println("converted kilograms = " +convertToKilograms);

        //Char
        char mychar = 'D';
        char myUnicodechar = '\u0044'; //004_...4
        System.out.println(mychar);
        System.out.println(myUnicodechar);
        char myCopyWrite = '\u00A9';
        System.out.println(myCopyWrite);

        //boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        //So total until now, 8 primitive types int,byte, float, double, char, boolean, short, long, other is string

        String myString = "This is string";
        System.out.println(myString);
        String myNumber = "123.45";
        String myotherNumber = "678.90";
        System.out.println(myNumber + myotherNumber);

        System.out.println("Keep Learning, enjoy Empowering");
    }
}
