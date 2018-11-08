
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        try(FileWriter writer = new FileWriter("dosya.txt");
                FileWriter writer2 = new FileWriter("dosya2.txt")){
            
            writer.write("Denemeye calisiyorum....");
            
            
        } catch (IOException ex) {
            System.out.println("Dosya olusturulurken hata olustu!");
        }
        */
        
        try(FileWriter writer = new FileWriter("diller.txt")){
            
            Scanner scanner = new Scanner(System.in);
            String dil;
            while(true){
                System.out.println("Bir dil giriniz: ");
                dil = scanner.nextLine();
                
                if (dil.equalsIgnoreCase("-1")){
                    System.out.println("Programdan cikiliyor\nDosyayi kontrol ediniz.");
                    break;
                }
                writer.write( dil + "\n");
            }
            
            
        } catch (IOException ex) {
            System.out.println("Dosya olusturulurken hata olustu!");
        }
    }
}
