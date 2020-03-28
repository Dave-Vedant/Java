package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone davePhone;
        davePhone = new DeskPhone(1234567890);
        //ITelephone davePhone;
        // ITelephone davePhone = new ITelephone(1234567890) {    // can not do this, it call whole interface here which we do not need

        davePhone.powerOn();
        davePhone.callPhone(1234567890);
        davePhone.answer();

        System.out.println("===================");

        davePhone = new Mobilephone(1234567890);
        davePhone.powerOn();
        davePhone.callPhone(1234567890);
        davePhone.answer();

        }


    }

