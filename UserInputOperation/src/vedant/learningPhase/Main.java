package vedant.learningPhase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter your birth year: ");
	// Now let's ensure the year of birth must have integer value

	boolean hasNextInt =  scanner.hasNextInt(); //inbuilt function to check int value.
	if (hasNextInt){
		int yearOfBirth  = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter you name: ");
		String name = scanner.nextLine();

		int age = 2020  - yearOfBirth;
		if(age>=0 && age<100){
			System.out.println("Your name is " + name + " and your age is " + age);
		} else {
			System.out.println("Invalid Entry!, check your birth year must be between  0 to 100");
		}
	} else {
		System.out.println("Unable to parse year of birth");
	}
		scanner.close();
    }
}
