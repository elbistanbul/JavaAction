import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgelniz...");
        String islemler = "Islemler...\n"
                + "1. Yazilimci islemleri\n"
                + "2. Yonetici islemleri\n"
                + "Cikis icin q` basiniz!!!";
        System.out.println(islemler);
        
        while(true){
            System.out.print("Islemi seciniz(yazilimci | Yonetici):");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("muhi", "Muha", 123, "python, C, JAVA");
                String yazilimci_islem = "1. Formay at\n"
                        + "2. Yazilimci bilgilerini goster.\n"
                        + "Cikis icin q`ya basiniz";
                System.out.println(yazilimci_islem);
                while(true){
                    System.out.print("Yazilimci islemini seciniz:");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("Isletim sistemi :");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAT(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")) yazilimci.bilgileriGoster();
                    else System.out.println("gecersiz yazilimci islemi!!!");
                }
                
            }
            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Sultan", "celebi", 321, 10);
                String yonetici_islemleri = "Yonetici islemleri \n"
                        + "1. Zam yap\n"
                        + "2. bilgileri goster\n"
                        + "Cikis icin q`ya basiniz...";
                System.out.println(yonetici_islemleri);
                while(true){
                    System.out.print("Yonetici islemi seciniz:");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yonetici islemelerinden cikiliyor");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("yoneticinin ne kadar zam yapmasini istiyorsunuz ?");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2")) yonetici.bilgileriGoster();
                    else System.out.println("Gecersiz islem girdiniz...");
                }
            }
            else System.out.println("Gecersiz islem secildi...");
        }
        
    }
}
