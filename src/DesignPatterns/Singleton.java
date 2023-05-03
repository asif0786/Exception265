package DesignPatterns;

import java.util.SimpleTimeZone;

public class Singleton {

    //private static Singleton s = new Singleton(); //creating static object of Type Singleton
    private static Singleton s = null;//increase lazy approach
    private Singleton(){}; //make private to restrict the constructor
    public  static synchronized Singleton getInstance(){
        if(s == null){
            s = new Singleton();//double checked //Lazy initialization
        }
        return s;
    }
    //Early Initialization
}

class main{
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); //creates s1 memory in heap
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.hashCode());

    }
}
