package Tutorial.BasicOperators;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class JavaArrays {
    public static void main(String args[]){
        double[] myList = {1.0, 1.2, 1.3, 1.4, 1.5};
        print(myList);
        System.out.println("Total : " + getTotal(myList));
        System.out.println("Max : " + getMax(myList));

        //array declaration
        double[] myArray = new double[2];
        myArray[0] = 1.6;
        myArray[1] = 0.5;
        print(myArray);

        sort(myArray);
        print(myArray);
        System.out.println(binarySearch(myArray, 1.6));
    }

    public static void print(double[] myList){
        for(double val : myList) {
            System.out.println(val);
        }
    }

    public static double getTotal(double[] myList){
        double total = 0;
        for(double val : myList) {
            total += val;
        }
        return total;
    }

    public static double getMax(double[] myList){
        double max = myList[0];
        for(double val : myList) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
