package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int num = 500; // desire starting number, even we can start the method by using a calling method statement
        for (int i = num ; i <= 10000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Num is divide by 3 and 5 both is " + i);
                count++;
                sum = sum +i;
            }
            if (count > 5) {
                System.out.println("All numbers are here");
                break;
            }
        }
        System.out.println("The whole sume of all the numbers are " + sum);
    }
    }

