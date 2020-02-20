package vedant.learningPhase;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int startNum = 4;
        int endNum = 20;
        int count = 0;
        // int totalEvenNum = 0; for another operation of counting total  # even numbers.
        while (startNum <= endNum){
            startNum ++;
            if (!isEvenNumber(startNum)){
                continue;
            } else{
                count ++;
            }
            if (count > 5){
                System.out.println("limit of 5 is reached");
                break;
            }
            System.out.println("The Even Numbers between given range are = " + startNum);
            // System.out.println("Total # of even numbers are = " + totalEvenNum);
    }
        System.out.println("----------------------------------------------------------");
        isPalindrome(1234);
        isPalindrome(-234);
        isPalindrome(0000);
        isPalindrome(11);
        System.out.println("---------------------");
        gcd(25,15);
        gcd(12,13);

    }

    public static boolean isEvenNumber(int num){
        if(num %2==0){
            return true;
        } else {
            return false;
        }
    }


//----------------------------------< Palindrome Number >--------------------------------------

    public static boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        while(original != 0){                           // while(original > 0) only return positive answers
            reverse = reverse *10 + original % 10;
            original = original / 10;
        }
        // System.out.println("The reverse Number is " + reverse);
        if (reverse == number) {
            System.out.println("The reverse number is " + reverse + " and given num is " + number);
            return true;
        } else {
            System.out.println("Its not palindrome");
            return false;
        }
    }

    // ------------------------------< greatest common divisor >-----------------------------------------------
    public static int gcd(int a , int b){
        int divisor = 0;
        int temp = 0;
        int tempDivisor = 0;
        if((a <10) || (b<10)){
            return -1;
        }
        if (a>b){
            temp = a;
        } else {
            temp = b;
        }
        for( int i = 1; i <= temp; i++){
            if (a % i == 0){
                if(b % i ==0){
                    tempDivisor = i;
                }
            }
            while (tempDivisor > divisor){
                divisor = tempDivisor;
            }
        }
        System.out.println("The Greatest common divisor is " + divisor);
        return 1;
    }

}
