/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArsmtrongSayisi;
import java.util.Scanner;

/**
 *
 * @author muhittin
 */
public class ArmstrongSayisi {
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Sayiyi giriniz");
            int sayi = input.nextInt();
            System.out.println("Basamak sayisi giriniz");
            int basamak_sayisi = input.nextInt();
            
            int gecici = sayi;
            int toplam = 0;
            do {           
                int basamak_degeri = gecici % 10;
                gecici /=10;
                toplam += Math.pow(basamak_degeri, basamak_sayisi);
               
            
        } while (gecici > 0);
            
        if (toplam == sayi){
            System.out.println("Sayimiz Armstrong sayisidir");
        }
        else{
            System.out.println("Sayi Armstrong sayisi degildir...");
        }
            
    }
    
}
