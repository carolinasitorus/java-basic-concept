package Tutorial.BasicOperators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {
    public static void main(String args[]){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.printf("%s %tB %<te, %<tY\n", "Due date:", date);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "2018-08-14" : args[0];
        System.out.print("Input parses as : ");
        Date t;
        try {
            t = sf.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + sf);
        }
    }
}
