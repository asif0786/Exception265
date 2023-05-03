package LambdaExpressions;
interface Anything{
    public void something();
}
public class LambdaDemo {
    public static void main(String[] args) {
        int a =1;
        Anything a1 = new Anything(){
            @Override
            public void something(){
                System.out.println("HI");
            }
        };
        a1.something();
    }
}
