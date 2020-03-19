package vedant.learningPhase;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String TheatreName;
    private List<Seat> seats = new ArrayList<Seat>();


    public Theatre(String theatreName, int numRow ,int seatsPerRow) {             //constructor ... one step ahead
        TheatreName = theatreName;

        int lastRow = 'A' + (numRow -1);
        for(char row = 'A' ; row<= lastRow;row++){
            for(int seatNum = 1; seatNum<=seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName() {        // getter
        return TheatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for (Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null){
            System.out.println("There is no seat "+ seatNumber);
        }
        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserve = false;


        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;

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
