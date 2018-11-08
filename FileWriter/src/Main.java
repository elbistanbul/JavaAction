
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("dosya.txt");
            writer.write("Java proglama dili\n  ");
            writer.write("Python programlama daha kolay\n");
            
            
        } catch (IOException ex) {
            System.out.println("Dosya acilirken bir sorun olustu...");
        }
        
        finally{
            if (writer != null) try {
                writer.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
            
        }
    }
}
