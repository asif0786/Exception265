import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Name: ");
//        String s = sc.next();
//        String regex = "[asif]+"; // for more than one letter use +
//        System.out.println(Pattern.matches(regex,s));
//        System.out.println(Pattern.matches("[asif]+",s));

//        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$"; // for email validation
//        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

//        String regex = "[6-9][0-9]{9}";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin Code: ");
        String s = sc.next();
        String regex ="[1-9][0-9][0-9]//s[0-9][0-9][0-9]";
        System.out.println(Pattern.matches(regex,s));

    }
}
