package vedant.learningPhase;

public class Mobilephone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobilephone(int myNumber) {                 // why constructor? ==> it store the number otherwise how you give value to class...!
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered on");        // we can not remove such method even if we do not need, because interface is contract for all method.
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("You have call from: " + phoneNumber);
        } else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging && isOn){
            isRinging = true;
            System.out.println("Responding to mobile phone please!");
        } else {
            isRinging = false;
            System.out.println("Different Phone or phone is not on ");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Melody ring");
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

