package vedant.learningPhase;
import java.util.ArrayList;

class intClass {                                           // define class intClass for reason 101, and this kind of class is called raper / wrapper
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] strArray = new String[10];             // create array
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();           // crate array list with string is perfect
        strArrayList.add("Vedant");

        //ArrayList<int> intArrayList = new ArrayList<int>();               // create int list is not possible because,
        //  ... above string is predefined class in Java but not
        // ... the int so, we need to make one class of int ... let's do it ...  101

        ArrayList<intClass> intArrayList = new ArrayList<intClass>();
        // intClassArrayList.add(25); ... is not correct way
        intArrayList.add(new intClass(25));                                 // this is called use of wrapper .. but its lengthy and messy  process...
        // ... we  should use autoBoxing and unBoxing process...   102

        Integer integer = new Integer(25);
        Double dbl = new Double(25.00);          // due to boxing both are scratched


        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));                  // autoBoxing
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "  -->  " + integerArrayList.get(i).intValue());           // unBoxing
        }


// from above we can understand that the following code works as ...

        Integer myInt = 25;       // works like // ...Integer.valueOf(25);
        int myIntValue = myInt;   // works like // myInt.intValue(25);


        System.out.println("================");
// =====================================================================================================================


        ArrayList<Double> dblClassArrayList = new ArrayList<Double>();
        for (double d = 0; d <= 10; d = d + 0.5) {
            dblClassArrayList.add(Double.valueOf(d));                // autoBoxing
        }

        for (int i = 0; i <= dblClassArrayList.size(); i++) {
            System.out.println(i + "  -->  " + dblClassArrayList.get(i).doubleValue());      //unBoxing
        }
    }
}


