package FileIO;

import java.io.FileOutputStream;

public class WriteDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream f1 = new FileOutputStream("C:\\Users\\ASIF\\IdeaProjects\\Exception265\\src\\FileIO\\writeDemo.txt");
            String s = "Asif is here"; //File to be written/
            byte b1[] = s.getBytes(); //get the converted byte code in b1 array
            f1.write(b1); //write the byte code after conversion
            f1.close();
            System.out.println("File Written...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
