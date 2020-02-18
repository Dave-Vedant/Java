package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesToCentimeters(5,8);
	calcFeetAndInchesToCentimeters(6);
	calcFeetAndInchesToCentimeters(4,90);

        System.out.println("Time Spans");
        getDurationString(89, 56);
        getDurationString(89, 89);
        getDurationString(-4,34);
        getDurationString(33);
        getDurationString(89);
        getDurationString(898495894);
        getDurationString(-938);

    }

    public static int calcFeetAndInchesToCentimeters(int Feet, int Inches){
        if( (Feet <0) || (Inches<0) || (Inches>12)){
            System.out.println("Invalid Parameters");
            return -1;
        }
        int Centimeters = (int) ((Feet * 12 * 2.54) + (Inches * 2.54));
        System.out.println("Total Centimeters are " + Centimeters);
        return Centimeters;
    }
    public static int calcFeetAndInchesToCentimeters(int Inches){ //just give warning to show one parameters
        if((Inches<0) && (Inches>12)){
            System.out.println("Invalid Parameters");
            return -1;
        }
        int Centimeters = (int) ((Inches * 2.54));
        System.out.println("Total Centimeters are " + Centimeters);
        return Centimeters;

    }

//--------------------------------------------< Minute and Second Challenge>-------------------------------------------
    public static int getDurationString(int minute, int seconds){
        if ((minute < 0)  || (seconds <0 ) || (seconds >59)){
            System.out.println("Invalid Parameters");
            return -1;
        }

        int hours = (int) minute/ 60;
        int minute_remain = (int) minute% 60;
        System.out.println(hours + "h " + minute_remain + "m "+ seconds + "s");
        return 1;
    }

    public static int getDurationString(int seconds){
        if ((seconds <0 )){
            System.out.println("Invalid Parameters");
            return -1;
        }

        int minutes = (int) seconds/ 60;
        int second_remain = (int) seconds % 60;
        System.out.println(minutes + "m "+ second_remain + "s");
        return 1;
    }

}

