
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYazma {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Muhi Muahha", 1234, "Bilgisayar Muhendisi");
        Ogrenci ogrenci2 = new Ogrenci("Akadir guclu", 2222, "Mekatronik Muhendisligi");
        Ogrenci ogrenci3 = new Ogrenci("Emre Erciyas", 3543, "Elektroik Muhendisi");
        
        Ogrenci [] ogrenci_array = {ogrenci1, ogrenci2, ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi!");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken I/O exception olustu!");
        } 
        
    }
}
