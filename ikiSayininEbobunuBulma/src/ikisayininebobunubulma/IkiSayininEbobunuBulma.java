
package ikisayininebobunubulma;

import java.util.Scanner;


public class IkiSayininEbobunuBulma {

    public static int ebobbulma(int sayi1, int sayi2){
        
        int ebob = 1;
        
        for (int i = 1; i <= sayi1 && i <= sayi2; i++){
            if((sayi1 % i == 0) && (sayi2 % i == 0)) ebob = i;
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        System.out.println("Birinci sayiyi giriniz: ");
        int birinci_sayi = scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int ikinci_sayi = scanner.nextInt();
        
        System.out.println("iki sayinin EBOB:" + ebobbulma(birinci_sayi, ikinci_sayi));
            System.out.println("--------------------------------------------------");
        }
    }
}
