package vedant.learningPhase;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to doing operation, autopilot shutdown");
        }



//        int x = 48;
//        int y  =0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFC(x,y));
//        System.out.println(divide(x,y));
//        int x = getInt();
//        System.out.println("The value of x " + x);

//        int y = getIntLBYL();
//        System.out.println("The value of y " + y);
//
//        int z = getIntEAFP();
//        System.out.println("The value of z " + z);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while(true){
            try{
                return s.nextInt();
            } catch(InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter a number with digit between 0 to 9");
            }
        }

    }

    private static int getIntLBYL() {                      // Look before you leap
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please Enter the number");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){                    // Ask for permission
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        try{
            return s.nextInt();
        } catch(InputMismatchException e){
            return 0;
        }
    }


    private static int divideLBYL(int x ,int y){
        if (y!=0){
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFC(int x, int y){
        try{
            return x/y;
        } catch(ArithmeticException e ){
            return 0;
        }
    }

    private static int divide(){           //multi exception statement. -- or may be you can directly give it to main class >> see above.
        int x,y;
        try{
            x = getInt();
            y = getInt();
            System.out.println("X is " + x + " y is " +y );
            return x/y;
        } catch (NoSuchElementException e){                               // No need of  these exceptions if you write same
            throw new ArithmeticException("No such exception");          // exceptions in the main class.
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by zero");
        }

    }

}
/*
Additional:
- stack trace: When you see error and click on blue error, so it directs you to line of code where we have error.
- Call stack: When you have grey error so it relates to java library so ctrl + click reach you to the error explanation.

 */


