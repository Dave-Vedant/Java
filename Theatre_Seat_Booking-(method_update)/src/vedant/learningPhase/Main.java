package vedant.learningPhase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seat_example = new ArrayList<>(theatre.seats);
        printList(seat_example);

        seat_example.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please, pay for the seat");
        } else {
            System.out.println("Seat is already reserved");
        }

        Collections.reverse(seat_example);
        System.out.println("Printing seat copy");
        printList(seat_example);
        System.out.println("");

        System.out.println("print theatre.seat");
        printList(theatre.seats);
        System.out.println("");

        System.out.println("Print shuffled list");
        Collections.shuffle(seat_example);
        printList(seat_example);
        System.out.println("");

        Theatre.Seat minSeat = Collections.min(seat_example);
        Theatre.Seat maxSeat = Collections.max(seat_example);

        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
        System.out.println("");

        System.out.println("The sorted list");
        sortList(seat_example);
        printList(seat_example);
        System.out.println("");

        // new deep copy list
        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList,theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list){

        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list){
        for(int i= 0; i<list.size() -1; i++){
            for(int j = i+1; j<list.size() ;j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i,j);
                }
            }
        }
    }

}
