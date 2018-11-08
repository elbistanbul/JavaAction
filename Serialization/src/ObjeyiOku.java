
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            
            Ogrenci ogrenci = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();
            System.out.println("****************");
            System.out.println(ogrenci);
            System.out.println("******************");
            System.out.println(ogrenci2);
        } catch (IOException ex) {
            System.out.println("Dosya acilamadi.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif bulunamadi.");
        }
    }
}
