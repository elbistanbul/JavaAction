/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhittin
 */
public class method2 {
    static String adi, soyadi;
    
    public static void main(String[] args) {
        degerAl("Mehmet", "Kirazli");
        yazdir();
        
    }
    static void degerAl(String ad, String soyad){
        adi = ad;
        soyadi = soyad;
    }
    static void yazdir (){
        System.out.println("Tam isim : " + adi + " " + soyadi);
    }
}
