package Tutorial.DataType;
/*
Variable type:
public : can be accessed from outside class
private: only can be used inside a class
constant : never change from their initial value
Static :
    - declare with static keyword
    - if public and final in capital case
    - if not public and not final in lower case
    - can be access by call the class name
 */
public class BasicDataType {
    private static double salary;
    public static final String Department = "Engineering Development";

    public static void main(String args[]){
    salary = 1000;
    System.out.println("Department : " + Department + " with Salary: " + salary);
    }
}
