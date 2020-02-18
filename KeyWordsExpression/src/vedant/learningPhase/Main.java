package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

        double kilometers = (100 * 1.6054509); // expression contains variable , operator, components(logic)
        // so, int(expression = expression);
       /* if (expression){
            System.out.println("expression");
        } */

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // concept of spaces
        System.out.println("This is " +
                "another" +
                "still more"); //  More Space, java understand
        int anotherVariable = 50;
        anotherVariable++;
        anotherVariable--; // No Space, java understand
        System.out.println("This is an another Variable");

        int marks = 75;
        int bonus = 30;
        if (marks  < 50) {
            int NewScore = marks + bonus;
            System.out.println("its quiet low, give bonus");
        } else if (marks == 50) {
            System.out.println("Its Ok");
        } else {
            System.out.println("ITs considerable");
        }
    }
}