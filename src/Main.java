public class Main {
    public static void main(String[ ] args) {
        try {
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[4]);
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
            int a = 100/1;
            System.out.println("a :"+a);
            int b = 100/0;
            System.out.println("b :"+b);
        }catch(ArithmeticException A){
            System.out.println("Arithmetic Exception Got");
        }
        }
}
