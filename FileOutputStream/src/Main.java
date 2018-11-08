
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");
        try {
            fos = new FileOutputStream("dosya.txt");
            //fos.write(65);
            //fos.write(123);
            
            //byte [] array = {101,56,23,55,67};
            //fos.write(array);
             String s = "Muhahahahah ahahah";
             byte [] s_array = s.getBytes();
             fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exection olustu...");
        } catch (IOException ex) {
            System.out.println("Dosya ya yazilirken bir hata olustu...");
        }
        
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
        }
    }
}
