package vedant.learningPhase;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	// write your code here
        int[] returnedArray = readIntegers(5);
        count(returnedArray);
        findMin(returnedArray);
    }

    private static int count(int[] array){
        int index = 0;
        for (int i = 0; i< array.length;i++){
            index = index +1;
        }
        System.out.println("Total counts are : " + index);
        return index;

    }

    // create method for read the element
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i =0; i<array.length;i++){
            System.out.println("Enter Number : \r");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array){
        int temp = array[0];
        for (int i = 0 ; i< array.length; i++){
            if (array[i] < temp){
                temp = array[i];
            } else {
                temp = temp;
            }
        }
        System.out.println("The minimum number is : " + temp);
        return temp;
    }
}
