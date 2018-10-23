
package methodoverloading.hesapmakinesi;

import java.util.Scanner;

public class MethodOverloadingHesapmakinesi {
    
    public static int cikarma(int a, int b){
        return (a-b);
    }
    
    public static double bolme (int a, int b){
        return ((double) a / b);
    }
    
    public static int toplama(int a, int b){
        return (a + b);
    }
    
    public static int toplama(int a, int b, int c){
        return(a + b + c);
    }
    
    public static int carpma (int a, int b){
        return(a * b);
    }
    
    public static int carpma (int a, int b, int c){
        return(a * b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Toplama Islemi\n"
                + "2. Cikarma Islemi\n"
                + "3. carpma Islemi\n"
                + "4. Bolme Islemi\n"
                + "Cikis icin q`ya basiniz";
        System.out.println("-----------------------------------------------");
        System.out.println(islemler);
        System.out.println("-----------------------------------------------");
        
        while(true){
            System.out.println("Isleminizi seciniz");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("kac deger toplayacaksiniz ?");
                int kacsayi = scanner.nextInt();
                if(kacsayi == 2){
                    System.out.println("Birinci sayiyi giriniz:");
                    int a = scanner.nextInt();
                    System.out.println("Ikinci sayiyi giriniz:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplamllari: " + toplama(a, b));
                    
                }
                else if (kacsayi == 3){
                    
                    System.out.println("Birinci sayiyi giriniz:");
                    int a = scanner.nextInt();
                    System.out.println("Ikinci sayiyi giriniz:");
                    int b = scanner.nextInt();
                    System.out.println("Ucuncu sayiyi giriniz:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplamllari: " + toplama(a, b, c));
                }
                else System.out.println("Bunun icin method bulunmuyor!!!");
              
            
            }
            else if (islem.equals("2")){
                System.out.println("Birinci sayiyi giriniz:");
                int a = scanner.nextInt();
                System.out.println("Ikinci sayiyi giriniz:");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin farki: " + cikarma(a, b));
            }
            
            else if(islem.equals("3")){
                System.out.println("kac deger carpacaksiniz ?");
                int kacsayi = scanner.nextInt();
                if(kacsayi == 2){
                    System.out.println("Birinci sayiyi giriniz:");
                    int a = scanner.nextInt();
                    System.out.println("Ikinci sayiyi giriniz:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpimlari: " + carpma(a, b));
                    
                }
                else if (kacsayi == 3){
                    
                    System.out.println("Birinci sayiyi giriniz:");
                    int a = scanner.nextInt();
                    System.out.println("Ikinci sayiyi giriniz:");
                    int b = scanner.nextInt();
                    System.out.println("Ucuncu sayiyi giriniz:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpimlari: " + carpma(a, b, c));
                }
                else System.out.println("Bunun icin method bulunmuyor!!!");
            }
            else if(islem.equals("4")){
                System.out.println("Birinci sayiyi giriniz:");
                int a = scanner.nextInt();
                System.out.println("Ikinci sayiyi giriniz:");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin bolumu: " + bolme(a, b));
            }
            else System.out.println("Gecersiz islem !!!");
        }
        
    }
    
}
