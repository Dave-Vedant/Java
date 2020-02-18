package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

        printConversion(15000);

        System.out.println("byte converter");
        printMegaBytesAndKiloBytes(2745);
        printMegaBytesAndKiloBytes(-456);
        printMegaBytesAndKiloBytes(0);

        System.out.println("barking dog");
        shouldWakeUp(true, 2);
        shouldWakeUp(true, 0);
        shouldWakeUp(true, 6);
        shouldWakeUp(true, 24);
        shouldWakeUp(false, 3);
        shouldWakeUp(false, 9);

        System.out.println("leap year");
        isLeapYear(1987);
        isLeapYear(2000);
        isLeapYear(2004);
        isLeapYear(1924);

        System.out.println("Three decimal place Comparison");
        areEqualByThreeDecimalPlaces(45.45667,45.456908);
        areEqualByThreeDecimalPlaces(90.50834,90.56809);

        System.out.println("Equal to sum");
        hasEqualSum(1,1,2);
        hasEqualSum(3,4,9);

    }

    //---------------------------------------------< Exercise 1 : Speed Converter >-----------------------------------------
    public static int toMilesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {
            return -1;
        } else {
            return (int) Math.round(kiloMetersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            int milesPerHour = toMilesPerHour(kilometersPerHour); //call function
            System.out.println(kilometersPerHour + "kn/h = " + milesPerHour + "mi/h");
        }
    }

    //-------------------------------------------------< MegaByteConverter >-------------------------------------------------------
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int MB = (kiloBytes / 1024);
            int KBRemain = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KBRemain + " KB");
        }
    }

//-----------------------------------------------< Dog Barking >--------------------------------------------------------
    public static void shouldWakeUp(boolean barking, int hoursOfDay) {
        if (barking == false){
            System.out.println("false");
        } else if (barking == true) {
            if (hoursOfDay < 8 && hoursOfDay >= 0) {
                System.out.println("true");;
            } else if (hoursOfDay > 22 && hoursOfDay <= 23) {
                System.out.println("true");;
            } else {
                System.out.println("false");;
            }
        }
    }
//---------------------------------------------< Leap year >------------------------------------------------------------
    //Logic of leap year is: divisible by 4 , and (if divisible by 100 but not by 400, then not a leap year)
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 ==0) {
                if (year%100==0){
                    if (year %400 ==0){
                        System.out.println(year + " is a leap year.");
                        return true;
                    }else {
                        System.out.println(year + " is not a leap year.");
                        return false;
                    }
                }else{
                    System.out.println(year + " is a leap year.");
                    return true;
                }
            } else {
                System.out.println(year + " is not a leap year.");
                return false;
            }
        }else {
            System.out.println("Parameter is not in range 1-9999");
            return false;
        }
    }

    //---------------------------------------------< Three Decimal Equal >----------------------------------------------

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int num1_new = (int) (num1 * 1000);
        int num2_new = (int) (num2 * 1000);
        if (num1_new == num2_new){
            System.out.println("Both number are equal");
            return true;
        } else{
            System.out.println("Both number are not equal");
            return false;
        }

    }

    //---------------------------------------------< Equal Sum >--------------------------------------------------------
    public static boolean hasEqualSum(int A, int B, int C){
        if (C == A +B){
            System.out.println("Sum is equal to Answer");
            return true;
        } else {
            System.out.println("Sum is not equal to Answer");
            return false;
        }
    }

    //---------------------------------------------< Teen Number (13-19) >----------------------------------------------
    public static boolean hasTeen(int X, int Y, int Z){
        if ((X >=13 && X<= 19) || (Y >=13 && Y<= 19) || (Z >=13 && Z<= 19)){
            System.out.println("There is at least one teen number");
            return true;
        } else {
            System.out.println("There are not teen number at all");
            return false;
        }
    }
//---------------------------------------------------< Extra>----------------------------------------------------------
    public static class TeenNumberChecker {
        public static boolean isTeen(int num) {
            return (num >= 13 && num <=19);
        }

        public static boolean hasTeens(int num1, int num2, int num3) {
            return isTeen(num1)  || isTeen(num2) || isTeen(num3);
        }
    }

}

