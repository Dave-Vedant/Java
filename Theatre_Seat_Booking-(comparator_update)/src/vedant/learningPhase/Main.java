package vedant.learningPhase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seat = new ArrayList<Theatre.Seat>();

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }

        System.out.println("============================");

        if(theatre.reserveSeat("B13")){
            System.out.println("Please, pay for the B13 "  );
        } else {
            System.out.println("Seat is already reserved");
        }

        System.out.println("=============================");

        if(theatre.reserveSeat("G11")){
            System.out.println("Please, pay for the G11");
        } else {
            System.out.println("Seat is already reserved");
        }

        System.out.println("==============================");

        if(theatre.reserveSeat("D12")){
            System.out.println("Please, pay for the D12");
        } else {
            System.out.println("Seat D12 is already reserved");
        }

        List <Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00" , 13.00));
        priceSeats.add(theatre.new Seat("A00" ,13.00));
        Collections.sort(priceSeats,theatre.price_order);             // collections.sort(list , method)
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list){

        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + ":$" + seat.getPrice() + ",");
        }
        System.out.println();
        System.out.println("=======================================");
    }


}
