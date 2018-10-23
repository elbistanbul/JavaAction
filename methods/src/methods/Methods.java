/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author muhittin
 */
public class Methods {

    /**
     * @param args the command line arguments
     */

    static int buyuksayi;
    public static void main(String[] args) {
     
        int x = hesapla(7,9);
        System.out.println("Buyuk sayi :" +x);
        
        // TODO code application logic here
    }
    static int hesapla(int a, int b){
        
        if (a>b)
            buyuksayi=a;
        else if (a<b)
            buyuksayi=b;
        return buyuksayi;
        
    }
    
    
    
    
    
    
}
