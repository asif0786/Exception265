package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo2{
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        System.out.println("For Each Loop:");
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println("Lambda Expression:");
        arr.forEach((i)-> System.out.println(i));
    }
}

//Lambda expression is used to provide the implementation/body of the method to an interface. It can only provide tp functional interfaces.