/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalsayibulma;

/**
 *
 * @author muhittin
 */
public class AsalSayibulma {
    
    public static boolean asalmi(int sayi){
       
        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0) return false;    
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        for (int i = 2; i < 1000; i++){
            if(asalmi(i)) System.out.println(i);   
        }
        System.out.println("Merhabalar");
    }
    
}
