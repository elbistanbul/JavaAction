/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhittin
 */
import java.util.Scanner;
public class denklemcozme {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int deger = s.nextInt();
        long sonuc = hesapla(deger);
        System.out.println("Carpim degeri:" + sonuc);
    }
    static long hesapla(int sayi){
        int carpim = 1;
        for (int i = 1; i <=sayi;i++){
            carpim*=i;
        }
        return carpim;
                
    }
    
}
