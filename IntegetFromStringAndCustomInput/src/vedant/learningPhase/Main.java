package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
        String stringNumberAsString = "2019";
        String stringNumberAsString1 = "1000";
        //String stringNumberAsString = "2000a";


        //lets convert and do the operation
        Integer number = Integer.parseInt(stringNumberAsString);
        double num = Double.parseDouble(stringNumberAsString1);

        stringNumberAsString += 1;
        num += 1;
        number += 1;

        // Observe the output difference
        System.out.println("stringNumberAsString = " + stringNumberAsString);
        System.out.println("stringNumberAsString  =" + num);

        System.out.println("number = " + number);

        System.out.println(" ========================= ");
        printSquareStar(5);
        System.out.println("==========================");
        printSquareStar(25);


    }

    //-----------------------------< print diagonal square with star >--------------------
    public static void printSquareStar(int input) {
        if (input < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= input; j++) {
                    if (i == 1 || j == 1 || i == j || j == i || i == input || j == input || j == (input - i + 1)) {
                        System.out.print("*"); // println add new line but we do not need it for our pattern
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
