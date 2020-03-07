package vedant.learningPhase;
// Arrays
public class Main {

    public static void main(String[] args) {
        // way to initialize the arrays are as follow:
                                  // ===================first ways:=======================
        int[] myIntArray = {23, 45, 34, 98, 25}; // total five elements and its index start form 0,
        double[] myDoubleArray = {45, 67, 89, 9, 987};




                                    // =================second way:==================
        // shows 20 elements in the array, now give values
        int[] myArray2 = new int[20];
        myArray2[0] = 23;
        myArray2[1] = 78;
        // ...
        myArray2[19] = 89;
        //.........myArray2[20] = 78;...........for 20 elements its 21st element give outbound value error;
        //System.out.println(myArray2[20]);
        //





                                       //=================Third way ==========================
        // define array name and initialize values
        int[] ArrayName = new int[10];                            // <dataType>[] name = new <dataType>[# elements];
        for (int i = 0; i < ArrayName.length; i++) {
            ArrayName[i] = i * 10;
            System.out.println("The element " + i + "'s value is : " + ArrayName[i]);
        }
        System.out.println("================< static function output> =================================");

        printArray(ArrayName);
    }

    // new method generation for use indirectly in main...

    public static void printArray(int[] Array){
        for( int i = 0; i<Array.length; i++){
            System.out.println("The element "+  i +"'s value is : " + Array[i]);
        }
    }
}
