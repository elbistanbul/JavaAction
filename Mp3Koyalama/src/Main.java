
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    public static void dosyaOku(){
        try {
            FileInputStream in = new FileInputStream("Puccini.mp3");
            int oku;
            
            while((oku = in.read()) != -1){
                icerik.add(oku);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public static void Kopyala(String dosyaIsmi){
        try {
            FileOutputStream out = new FileOutputStream(dosyaIsmi);
            for (int deger: icerik){
                out.write(deger);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        
        dosyaOku();
        long baslangic = System.currentTimeMillis();
        Kopyala("Puccini2.mp3");
        Kopyala("Puccini3.mp3");
        Kopyala("Puccini4.mp3");
        long bitis = System.currentTimeMillis();
        
        System.out.println("Kopyalama suresi: " + (bitis - baslangic)/1000 + " saniye.");
        
    }
}
