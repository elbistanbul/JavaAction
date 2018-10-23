
package method;

import java.util.Scanner;

public class Method {

    public static void selamlama(){
        System.out.println("Merhaba nasilsiniz...");
        System.out.println("iyilik ne olsun ...");
    }
   public static void faktoriyel(){
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       int sayi = scanner.nextInt();
       
       int faktoriyel = 1;
       
       while(sayi > 0){
           faktoriyel *= sayi;
           sayi--;
       }
       System.out.println("Girdiginiz sayinin faktoriyeli:" + faktoriyel);
       
   }
    public static void main(String[] args) {
       
        faktoriyel();
    }
    
}
