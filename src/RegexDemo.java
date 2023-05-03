import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("..s"); //any 3 letter ends with s
        System.out.println("Enter 3 Letter Word for Pattern Matching : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        if(b){
            System.out.println("s is the last letter input string");
        }else{
            System.out.println("s is not the last letter input string");
        }
    }
}
