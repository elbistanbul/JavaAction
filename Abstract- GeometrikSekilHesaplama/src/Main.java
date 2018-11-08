
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         
        /*
        Kare kare1 = new Kare("kare1", 4);
        Daire daire1 = new Daire("daire1", 5);
        
        Sekil ucgen;
        ucgen = new Ucgen(3, 4, 5, "ucgen1");
        
        kare1.alanHesapla();
        daire1.alanHesapla();
        ucgen.alanHesapla();
        */
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "____________\n"
                + "Islemler...\n"
                + "1. Karenin alanini hesapla.\n"
                + "2. Ucgenin alanini hesapla.\n"
                + "3. Dairenin alanini hesapla.\n"
                + "Cikis icin q` basiniz.\n"
                + "_________________";
        
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi seklin alaninini hesaplamak istiyorsunuz.");
            
            String sekil_turu = scanner.nextLine();
            
            Sekil sekil = null;
            
            if (sekil_turu.equalsIgnoreCase("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            
            else if (sekil_turu.equalsIgnoreCase("1")){
                System.out.println("Karenin kenarini giriniz: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare", kenar);
                sekil.alanHesapla();
            }
            
            else if (sekil_turu.equalsIgnoreCase("2")){
                System.out.println("Ucgenin 1. kenar`i giriniz");
                int kenar1 = scanner.nextInt();
                System.out.println("Ucgenin 2. kenar`i giriniz");
                int kenar2 = scanner.nextInt();
                System.out.println("Ucgenin 3. kenar`i giriniz");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen(kenar1, kenar2, kenar3,"Ucgen");
                sekil.alanHesapla();
                
            }
            
            else if (sekil_turu.equalsIgnoreCase("3")){
                System.out.println("Dairenin yaricapini giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire", yaricap);
                sekil.alanHesapla();
                
            }
            
            else System.out.println("Gecerli bir islem giriniz...");
        }
        
    }
}
