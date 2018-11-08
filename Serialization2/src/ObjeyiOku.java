
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
           Ogrenci[] ogrenci_array = (Ogrenci [])in.readObject();
            ArrayList<Ogrenci> ogrenci_list =(ArrayList<Ogrenci>)in.readObject();
            
            System.out.println("*****************");
            for (Ogrenci s: ogrenci_array) {
                System.out.println(s);
                System.out.println("---------------");
            }
            System.out.println("*****************");
            for (Ogrenci s: ogrenci_list) {
                System.out.println(s);
                System.out.println("---------------");
            }
            System.out.println("*****************");
            
            
        } catch (IOException ex) {
            System.out.println("Dosya acilamadi.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif bulunamadi.");
        }
    }
}
