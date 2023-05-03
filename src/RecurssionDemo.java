public class RecurssionDemo {
    static void print(int n){
        if (n>0){
            System.out.println(n + " ");//50 to 1
            print(n-1);
            System.out.println(n + " ");//1 to 50
        }
    }

    public static void main(String[] args) {
        print(50);
    }
}
