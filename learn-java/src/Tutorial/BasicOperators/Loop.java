package Tutorial.BasicOperators;

public class Loop {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers){
            System.out.print(number);
            System.out.print(", ");
        }
    }
}
