
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz...");
        String idmanlar = "Gecerli hareketler\n"
                + "Burpee\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman olusuturun...");
        System.out.print("Burpee sayisi: ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayisi: ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayisi: ");
        int situp = scanner.nextInt();
        System.out.print("Squat sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("idamniniz basliyor...");
        
        int i = 1;
        try(FileWriter writer = new FileWriter("log.txt")){
            
            writer.write("Idman Programi...\n");
            writer.write("Burpee sayisi: " + idman.getBurpee_sayisi()+"\n");
            writer.write("Pushup sayisi: " + idman.getPushup_sayisi()+"\n");
            writer.write("Situp sayisi:" + idman.getSitup_sayisi()+"\n");
            writer.write("Squat sayisi: " + idman.getSquat_sayisi()+"\n");
            
        
        while(idman.idmanBittiMi() == false){
            System.out.print("Hareket turu(Burpee, Pushup,Situp, Squat) :");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kactane yapacaksiniz: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
            writer.write(i + ". islem ------> Hareket : " + tur + " Sayisi: " + sayi +"\n");
            i++;
       
        }
    
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
