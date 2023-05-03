interface Print1{
    public default  void print(){
        System.out.println("Interface 1");
    };
}
interface  Print2{
    public default void print(){
        System.out.println("Interface 2");
    };
}
public class Diamond implements Print1, Print2{
    //Using Override to resolve Diamond Problem
    @Override
    public void print(){
        Print1.super.print();
        Print2.super.print();
    }

    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.print();
    }
}
