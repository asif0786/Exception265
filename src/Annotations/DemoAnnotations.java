package Annotations;

public class DemoAnnotations {
    public void function1 (){
        System.out.println("Function 1 is running");
        }
    @Deprecated
    public void function2(){
        System.out.println("Function 2 is running");
    }

    public static void main(String[] args) {
        DemoAnnotations d = new DemoAnnotations();
        d.function1();
        d.function2();
    }

    @FunctionalInterface
    interface Doeable{
        public abstract  void f1();
    }
}
