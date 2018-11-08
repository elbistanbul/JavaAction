
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");
            
            /*
            System.out.println("Okunan deger: " + (char)fis.read());
            System.out.println("Okunan deger: " + (char)fis.read());
            System.out.println("Okunan deger: " + (char)fis.read());
            System.out.println("Okunan deger: " + (char)fis.read());
            System.out.println("Okunan deger: " + (char)fis.read());
            System.out.println("Okunan deger: " + (char)fis.read());
            */
            /*
            fis.skip(5);
            System.out.println("Okunan karakter:" + (char)fis.read());
            System.out.println("Okunan karakter:" + (char)fis.read());
            System.out.println("Okunan karakter:" + (char)fis.read());
            */
            
            /*
            int deger;
            String s = "";
            while((deger = fis.read()) != -1){
                s += (char)deger;
            }
            System.out.println("Dosya icerigi: " + s);

            */
            
            int deger;
            int say = 0;
            fis.skip(5);
            String s = "";
            while((deger = fis.read()) != -1){
                s += (char)deger;
                say++;
                if (say == 10) break;
            }
            System.out.println("Dosyanin 5`den sonra 10 karakter okuduk: " + s);
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File bulunamadi...");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata olustu...");
        }
        
        finally{
            try {
                if (fis != null){
                    fis.close();
                }
                
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
        }
        
    }
}
