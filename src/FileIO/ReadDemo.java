package FileIO;

import java.io.FileInputStream;

public class ReadDemo {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("C:\\Users\\ASIF\\IdeaProjects\\Exception265\\src\\FileIO\\demo.txt");
            int i = 0;
            while ((i = f1.read()) != -1){
                System.out.println((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
