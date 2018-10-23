/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.algorithm;
import java.util.Scanner;
/**
 *
 * @author muhittin
 */
public class recursiveFaktoriyel {
    
    public static int faktoriyel (int a){
        
        if (a == 1){
            return 1;
          
    }
        return a * faktoriyel(a - 1);
}
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        
        int sayi;
        
        while(true)
        {
        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();
        if (sayi == -1){
            break;
        }
        else{
        System.out.println(faktoriyel(sayi));
        }
        }
    }
    
}
