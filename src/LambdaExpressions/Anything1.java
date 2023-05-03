package LambdaExpressions;

public interface Anything1 {
    public String something(int t);
}

class demoMain{
    public static void main(String[] args) {
        Anything1 a = (int i)-> {
            System.out.println("Hi");
            return "Hey";
        };

        String l = a.something(4);
        System.out.println(l);
    }
}
