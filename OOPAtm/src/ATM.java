
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class ATM {

    void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bamkamiza hosgeldiniz:)");
        
        System.out.println("*************************************");
        System.out.println("Kullanici Girisi");
        System.out.println("*************************************");
        int giris_hakki = 3;
        
        while(true){
            if (login.login(hesap)){
            System.out.println("Giris basarili...");
            break;
            }
            else{
            System.out.println("Giris basarisiz!!!");
            giris_hakki--;
            System.out.println("Kalan giris hakkiniz: " + giris_hakki);
            }
        
            if (giris_hakki == 0){
            System.out.println("Giris hakkiniz bitmistir.");
            return;
        }
        }
        System.out.println("*******************************");
            String islemler = "1. Bakiye Goruntule\n"
                    + "2. Para yatirma\n"
                    + "3. Para cekme\n"
                    + "Cikis icin q`ya baisiniz...";
            System.out.println(islemler);
            System.out.println("*******************************");
            
            while(true){
                System.out.println("Islem seciniz...");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) break;
            else if (islem.equals("1")) System.out.println("bakiyeniz: "+hesap.getBakiye());
            else if (islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutari yaziniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatirma(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Cekmek istediginiz miktari belirtiniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else System.out.println("Gecersiz islem sectiniz !!!");
            }
            
    
    }
}
