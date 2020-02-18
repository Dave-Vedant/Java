package vedant.learningPhase;

public class Main<function> {

    public static void main(String[] args) {
        // use for getting the output

        getDaysInMonth(3,2456);
        getDaysInMonth(2 ,2004);
        getDaysInMonth(2, 2000);


        System.out.println(" ");
        printDayOfTheWeek(3);
        printDayOfTheWeek(6);
	// write your code here
        System.out.println(" ");
        char typedName = 'H';

        switch(typedName) {
            case 'A':
                System.out.println("A is typed");
                break;
            case 'B':
                System.out.println("B is typed");
                break;
            case'C':
                System.out.println("C is typed ");
                break;
            case 'D':
                System.out.println("D is typed");
                break;
            case 'E':
                System.out.println("E is typed");
                break;
            case 'F' : case 'G': case 'H':
                System.out.println(typedName  + " is typed");
                break;
            default:
                System.out.println("A,B,C,D,E are not typed until now");
                break;
        }
    }

    public static void printDayOfTheWeek(int Day){
        switch(Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No week name here");
        }
    }



    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return - 1;
        }

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year) == true) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
        }
        return -1;

    }
}
