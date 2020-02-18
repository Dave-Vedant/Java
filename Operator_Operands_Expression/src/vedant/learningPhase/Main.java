package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

        int result = 1 +5;
        System.out.println(result);
        result = result -1;
        System.out.println(result);
        result = result *10;
        System.out.println(result);
        //same for other operators divide, subtract, Multiplication, Addition, Modulo

        result ++;
        System.out.println(result);
        result += 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == true); //Possible error : Assignment operator if (x == 50) instead of (x= 50);
            System.out.println("with ; sign It is not an Alien.");

        if (isAlien == true){
            System.out.println("Another case result: ");
            System.out.println("It is not an Alien.");
            System.out.println("Its amazing");
        } //(code block must require for long coding where we need to get bug.  It declare whole output statements
        // here 2 statements as output of one logic.)

        int firstNumber = 200;
        int secondNumber = 300;
        if ((firstNumber >secondNumber) && (firstNumber == 200))/*() for easy reading*/ {
            System.out.println("The statement is true.");
        }

        if ((firstNumber < secondNumber) || (firstNumber != 200))/*() for easy reading*/ {
            System.out.println("The statement(OR) is true.");
        }
        /* The & operator is bitwise operator,working with bit-level.
         on the other side |(or) is logic level operator which is used with boolean operands.
         */

        boolean isCar =true;
        if (isCar) {
            System.out.println("make dream false");
        } else {
            System.out.println("make dream true");
        }
        boolean wasCar = isCar ? true: false; //Ternary operator.
        if(wasCar) {
            System.out.println("then achieve it");
        }

        //operator challenge
        double first = 20.00D;
        double second = 80.00D;
        double operation1 = (first + second * 100D);
        System.out.println(operation1);
        double operation2 = operation1% 40D;
        System.out.println(operation2);
        boolean check = (operation2 == 0)? true : false; //ternary operand
        System.out.println("is no reminder");
        if (!check){
            System.out.println("Got some reminder");
        }
        System.out.println("keep learning, Be Empowering");
    }
}
