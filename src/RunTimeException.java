class AgeException extends RuntimeException{
    public AgeException(String s){
        super(s);
    }
}
public class RunTimeException {
    void ageChecker(int a) throws AgeException{
        if(a<18){
            throw new AgeException("Age not correct ");
        }else{
            System.out.println("Eligible Age");
        }
    }

    public static void main(String[] args) {
        RunTimeException m = new RunTimeException();
        try {
            m.ageChecker(10);
            m.ageChecker(40);
        }catch(AgeException e){
            e.printStackTrace();
        }
        System.out.println("Handeled");
    }
}
