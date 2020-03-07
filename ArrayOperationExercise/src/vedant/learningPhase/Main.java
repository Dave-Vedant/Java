package vedant.learningPhase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myCallingArray = getArray(5);         // call predefined method and initialize array...
        for(int i = 0; i<myCallingArray.length;i++){
            System.out.println("Element "+ i + " value is " + myCallingArray[i]);
        }

        int[] test = {1,1,1,1,1,1,1,1};

        System.out.println("");
        System.out.println("The average value of our array  is: " + getAverage(myCallingArray));
        System.out.println("");


        System.out.println(test.toString());     //give something different
        System.out.println(Arrays.toString(test));            // give desire whole array... keep in mind




    }

    // create method getArray...
    public static int[] getArray(int number){
        System.out.println("Please, Enter you Number :\r ");
        int[] value = new int[number];

        for (int i = 0 ;i <value.length; i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }

    // create method getAverage...
    public static double getAverage(int[] array){
        int sum  = 0;
        for (int i =0; i<array.length;i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}
