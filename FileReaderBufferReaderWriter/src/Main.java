
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        /*
        try(Scanner scanner = new Scanner( new FileReader("goodfellas.txt"))){
            while(scanner.hasNextLine()){
               
                //System.out.println("Okunan Satir: " + scanner.nextLine());
                String ogrenci_bilgisi = scanner.nextLine();
                String [] s = ogrenci_bilgisi.split(",");
                if (s[1].equalsIgnoreCase("Bilgisayar Muhendisligi")){
                    System.out.println("Ogrenci bilgisi: " + ogrenci_bilgisi);
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken bir hata olustu!");
        }
        */
        /*
        try(Scanner scanner = new Scanner( new BufferedReader(new FileReader("goodfellas.txt")))){
            while(scanner.hasNextLine()){
               
                //System.out.println("Okunan Satir: " + scanner.nextLine());
                String ogrenci_bilgisi = scanner.nextLine();
                String [] s = ogrenci_bilgisi.split(",");
                if (s[1].equalsIgnoreCase("Bilgisayar Muhendisligi")){
                    System.out.println("Ogrenci bilgisi: " + ogrenci_bilgisi);
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acilirken bir hata olustu!");
        }
        */
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("goodfellas.txt", true))){
            
            writer.write("Alperen Bacak, Elektronik Muhendisligi\n");
            
        } catch (IOException ex) {
            System.out.println("Dosya acilirken hata olustu!");
        }
    }
}
