/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.algorithm;
import java.util.Scanner;
import javax.swing.SortOrder;
/**
 *
 * @author muhittin
 */
public class denemekabarcik {
    
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sayilar[], kac_sayi, unsort[], tmp;
        
        System.out.println("kac sayi girmek istersiniz: ");
        
        kac_sayi = input.nextInt();
        sayilar = new int[kac_sayi];
        unsort = new int[kac_sayi];
        
        for (int i = 0; i < kac_sayi; i++)
        {
            System.out.println(i+1 + ". sayiyi giriniz...");
            sayilar[i] = input.nextInt();
            unsort[i] = sayilar[i];
        }
        
        for (int j = 1; j < kac_sayi;j++)
        {
            for (int i = 0; i < kac_sayi - j;i++)
            {
                if (sayilar[i] > sayilar[i+1])
                {
                    tmp = sayilar[i];
                    sayilar[i] = sayilar[i+1];
                    sayilar[i+1] = tmp;
                }
            }
        }
        
        System.out.println("silanmamis dizi");
        for (int i = 0; i < kac_sayi;i++)
        {
            System.out.print(unsort[i] + "-");
        }
        System.out.println("siralanmis dizi");
         for (int i = 0; i < kac_sayi;i++)
        {
            System.out.print(sayilar[i] + "-");
        }
    }
}
