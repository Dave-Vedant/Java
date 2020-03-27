package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Theatre theatre = new Theatre("Cineplex",8,12);  //create object...
//        theatre.getSeats();

        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay to secure your seat");
        } else {
            System.out.println("Sorry, Seat is already reserved, Please change your seat");
        }

        System.out.println("*_*_*_*_*_*_*_*_");

        // Repeat code for testing conflict scenario...
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay to secure your seat");
        } else {
            System.out.println("Sorry, Seat is already reserved, Please change your seat");
        }
    }
}
