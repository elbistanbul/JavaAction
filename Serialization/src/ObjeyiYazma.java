
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYazma {
    public static void main(String[] args) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            Ogrenci ogrenci = new Ogrenci("Muhahah Hahaha", 1234, "Bilgisayar Muhendisiligi");
            Ogrenci ogrenci2 = new Ogrenci("Melih Cevdet Anday", 4332, "Elektronik Muhendisiligi");
            out.writeObject(ogrenci);
            out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi!");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken I/O exception olustu!");
        } 
        
    }
}
