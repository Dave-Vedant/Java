package vedant.learningPhase;

import java.util.*;

public class Theatre {
    private final String TheatreName;
    private List<Seat> seats = new ArrayList<>();            // collection >> HashSet,List-all,LinkedHashSet and other from same hierarchy,


    public Theatre(String theatreName, int numRow ,int seatsPerRow) {             //constructor ... one step ahead
        this.TheatreName = theatreName;

        int lastRow = 'A' + (numRow -1);
        for(char row = 'A' ; row<= lastRow; row++){
            for(int seatNum = 1; seatNum<=seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName() {        // getter
        return TheatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >=0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is not seat " + seatNumber);
            return false;
        }
    // Comment: collection's binary search is fastest way to compare and code is also faster and small...

//        for (Seat seat : seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null){
//            System.out.println("There is no seat "+ seatNumber);
//        }
//        return requestedSeat.reserve();
   }

    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserve = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }


        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }



        public boolean reserve(){
            if(!reserve){
                this.reserve = true;
                System.out.println(" seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if(reserve){
                this.reserve =false;
                System.out.println(" Reserved Seat "+ seatNumber+ " is cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }


    }


}
