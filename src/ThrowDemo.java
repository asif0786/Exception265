public class ThrowDemo {
    public static void foodFeedback(int a){
        if(a ==1){
            System.out.println("Food was Good");
        }else{
            throw new RuntimeException("Food Was Disgusting");
        }
    }
    public static void main(String[] args) {
        foodFeedback(2);
    }
}
