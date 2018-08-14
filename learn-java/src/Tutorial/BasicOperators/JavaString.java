package Tutorial.BasicOperators;

public class JavaString {
    public static void main(String args[]){
        char [] name1 = {'c', 'a', 'r', 'o', 'l'};
        char [] name2 = {'C', 'A', 'R', 'O', 'L'};
        char [] name3 = {'C', 'A', 'R', 'O', 'L'};
        String nameString1 = new String(name1);
        String nameString2 = new String(name2);
        String nameString3 = new String(name3);
        System.out.println("Name : ".concat(nameString1));
        System.out.printf("Name : %s\n", nameString1);
        System.out.println("Chart at 0 : " + nameString1.charAt(0));
        System.out.println("Compare to : " + nameString1.compareTo(nameString2));
        System.out.println("Compare to ignorecase : " + nameString1.compareToIgnoreCase(nameString2));
        System.out.println("Content equals : " + nameString2.contentEquals(nameString3));
        System.out.println("Copy value of : " + nameString1.copyValueOf(name3));
        System.out.println("Ends with : " + nameString1.endsWith("rol"));
        System.out.println("Equals : " + nameString1.equals(nameString2));
        System.out.println("Equals ignore case : " + nameString1.equalsIgnoreCase(nameString2));
        System.out.println("Indef of : " + nameString1.indexOf("c"));
        for(int i=0; i<nameString1.length(); i++){
            System.out.println(String.valueOf(nameString1.charAt(i)).toUpperCase());
        }
    }
}
