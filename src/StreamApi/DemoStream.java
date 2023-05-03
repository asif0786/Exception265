package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {


    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        List<String> namesWithA = arr.stream().filter(i ->i.startsWith("A")).collect(Collectors.toList());
        //List<String> namesWithA = arr.stream().filter(i ->i.startsWith("A")).sorted(Collectors.toList());

        for(String i: namesWithA){
            System.out.println(i);
        }
        for(String i:arr){
            System.out.println(i);
        }
    }
}


