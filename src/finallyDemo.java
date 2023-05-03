public class finallyDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            int av = 10;
            av = 1000/0;
            System.out.println(s.length());
            System.out.println(av);

        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (NullPointerException n)
        {
            n.printStackTrace();
        }finally{
            System.out.println("Hello");
        }
        System.out.println("Hello world!");
    }
}