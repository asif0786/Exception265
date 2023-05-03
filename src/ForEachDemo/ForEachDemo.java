package ForEachDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8};
        //ArrayList <String> arr = new ArrayList<String>();
        Map<String,String> arr  = new HashMap<String,String>();
        arr.put("Iqbal","Asif");
        arr.put("Roy","Pinaki");
        arr.put("Nath","Raghu");
        arr.put("Shirke","Shubham");
        arr.put("Balla","Vidya");
        arr.put("Reddy","Gurunath");
        arr.put("Chavhan","Akash");
        arr.put("Pawar","Omkar");
        arr.put("Wanare","Kapil");

        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        System.out.println("For Each Loop");
        for(String i : arr.keySet()){
            System.out.println(i);
        }

        //Shortcut lambda function way of printing hashmap
        arr.forEach((k,v)->System.out.println("Last Name: "+k+" "+"; First Name: "+v));
    }

}
