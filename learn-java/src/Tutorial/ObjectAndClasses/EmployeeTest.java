package Tutorial.ObjectAndClasses;

/*
1. Class: suatu blueprint object yang mendeskripsikan state atu behavior objek
state: atribut
behavior : fungsi2.
2. Object : Mempunyai status dan behavior
creating object by:
- declaration
- instatiation by using keyword new, followed by
- initializationn (call constructor)
 */
public class EmployeeTest {
    public static void main(String args[]){
        Employee employee1 = new Employee("Carol");
        Employee employee2 = new Employee("lina");

        employee1.setAge(22);
        employee1.setDesignation("Software Engineer");
        employee1.setSalary(1000);
        System.out.println(employee1.toString());

        employee2.setAge(23);
        employee2.setDesignation("Backend Developer");
        employee2.setSalary(2000);
        System.out.println(employee2.toString());
    }
}
