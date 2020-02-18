package vedant.learningPhase;
public class Main {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysInMonth(2,2000);

    }
    public static boolean isLeapYear(int year){
        if ((year <1) || (year> 9999)){
            return false;
        }
        if ((year%4==0) && (year%100!=0)) {
            System.out.println("leap year");
            return true;
        } else if  ((year%4==0) && (year%100==0) && (year%400==0)) {
            System.out.println("leap year");
            return true;
        } else {
            System.out.println("Not leap year");
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year){
        if ((month<1) || (month>12)){
            return -1;
        }else if ((year<1)|| (year>9999)){
            return -1;
        } else {
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 days");
                    return 31;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    return 30;
                case 2:
                    if (isLeapYear(year)==true) {
                        System.out.println("29 days");
                        return 29;

                    } else {
                        System.out.println("28 days");
                        return 28;
                    }
                default:
                    System.out.println("Invalid month");
                    break;
            }
        }
        return -1;
    }
}

