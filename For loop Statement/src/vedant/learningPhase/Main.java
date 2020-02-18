package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
        //calculateInterest(2000, 10);
        //isPrime(30);
        isPrimeNum(20);
        isPrimeNum(11);
        System.out.println(" ======================");
        firstThreePrime(11);
        firstThreePrime(34);
        firstThreePrime(43);

    }
/*
    public static double calculateInterest(double amount, double i) {
        for (i = 2; i < 9; i = i + 2) {
            System.out.println("The interest is " + (amount * i) / 100);
        }
        return ((amount * i) / 100);
    }

    public static boolean isPrime(int n) {
        int count = 0;
        if (n == 1) {
            return false;
        }
*/

    public static boolean isPrimeNum(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                //System.out.println(n + " is not prime num");
                return false;
            }
        }
        System.out.println(n + " is prime num.");
        return true;
    }

    public static int firstThreePrime(int num) {
        int count = 0;
        for (int i= num;i < 50; i++) {
            if (isPrimeNum(i)) {
                count++;
                if (count == 3) {
                    System.out.println("==================< next num >=================");
                    break;
                }
            }
        }
        return -1;
    }
}



