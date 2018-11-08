
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    static String ogrenciBilgileri;
    
    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot){
    
        String cikti = "";
        double toplamNot = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (finalnot * 4/10.0);
        
        if (toplamNot >= 90){
            cikti = isim + " bu dersten AA aldi.";
        }
        
        else if (toplamNot >= 80){
             cikti = isim + " bu dersten BB aldi.";
        }
        
        else if (toplamNot >= 70){
             cikti = isim + " bu dersten CC aldi.";
        }
        
        else if (toplamNot >= 60){
             cikti = isim + " bu dersten DD aldi.";
        }
        
        else if (toplamNot >= 55){
             cikti = isim + " bu dersten FD aldi.";
        }
        
        else{
            cikti = isim + " bu dersten FF aldi.";
        }
        
        return cikti;
}
    
    public static void main(String[] args) {
        
       
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("ogrecinotlari.txt")){
            
            while (scanner.hasNextLine()){
                ogrenciBilgileri  = scanner.nextLine();
                String [] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);
                
                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                
                writer.write(cikti + "\n");
                
                //System.out.println(ogrenciBilgileri);
                
                //for (String s: ogrenciArray) System.out.println(s);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(ogrenciBilgileri);
    }
}
