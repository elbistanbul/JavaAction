

package sort.algorithm;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int sayilar [], kac_sayi, temp, unsort[];
        
        System.out.println("Kac sayi girmek istersiniz");
        
        kac_sayi = input.nextInt();
        sayilar = new int[kac_sayi];
        unsort = new int[kac_sayi];
        
        for (int i = 0; i < kac_sayi ; i++)
        {
            System.out.println(i+1 + ". sayiyi giriniz");
            sayilar[i] = input.nextInt();
            unsort[i] = sayilar[i];
        }
        
        for (int j = 1; j < kac_sayi; j++)
        {
            for (int i = 0; i < kac_sayi - j; i++ )
            {
                if (sayilar[i] > sayilar[i+1])
                {
                    temp = sayilar[i];
                    sayilar[i] = sayilar[i + 1];
                    sayilar[i + 1] = temp;
                }
            }
        }
        System.out.println("Siralanmamais ve siralanmis sayilar");
        for (int i = 0; i < kac_sayi; i++)
        {
            System.out.print(unsort[i] + "-");
        }
        System.out.println("\n");
        for (int i = 0; i < kac_sayi; i++)
        {
            System.out.print(sayilar[i] + "-");
        }
    }
    
}
