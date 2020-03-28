package vedant.learningPhase;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {                 // why constructor? ==> it store the number otherwise how you give value to class...!
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desktop phone hasn't such power button");        // we can not remove such method even if we do not need, because interface is contract for all method.
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("You have call from : " + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Responding to desk phone please!");
            isRinging = false;                    // stop ringing after action, assumed, manually action taken
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return false;
    }


    @Override
    public boolean isRinging() {
        return false;
    }
}
