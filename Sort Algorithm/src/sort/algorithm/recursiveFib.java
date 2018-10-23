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
public class recursiveFib {
    
    public static int fib (int a)
    {
        if(a == 0) return 1;
        if(a == 1) return 1;
        return fib(a-1) + fib(a-2);
    }
    
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sayi;
        
        while (true)
        {
            System.out.println("Sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi == -1)
             break;
            
            else
            {
            System.out.println("Fibonaci sayisi: " + fib(sayi) + "\n");
            }
        }
       
    }
    
}
