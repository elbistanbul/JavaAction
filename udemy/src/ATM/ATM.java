/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;
import java.util.Scanner;
/**
 *
 * @author muhittin
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int bakiye = 1000;
        String islemler = "1. islem: Bakiye ogrenme\n"
                + "2. islem: Para cekme\n"
                + "3. islem: Para yatirma\n"
                + "Cikis icin q";
        
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        
        
        while(true)
        {
            System.out.println("Islem seciniz");
            String islem = input.nextLine();
            
            if (islem.equals("q"))
            {
                System.out.println("Programdan cikiliyor....");
                break;   
            }
            
            else if (islem.equals("1")){
                        System.out.println("Bakiyeniz: " + bakiye);
                        }
            else if (islem.equals("2")){
                        System.out.println("Cekmek istediginiz tutari giriniz lutfen...");
                        int tutar = input.nextInt();
                        input.nextLine();
                        
                        if ( bakiye - tutar < 0){
                            System.out.println("Yeterli bakiyeniz yok, bakiyeniz: " + bakiye);
                        }
                        else{
                            bakiye -= tutar;
                            System.out.println("Yeni bakiyeniz: " + bakiye);
                        }
               
                        }
            else if (islem.equals("3")){
                    System.out.println("Yatirmak istediginiz tutari giriniz...");
                    int tutar = input.nextInt();
                    input.nextLine();
                    bakiye += tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                        
                        }
            else if (islem.equals("4")){
                        
                        }
            else{
                System.out.println("gecersiz islem...");
            }
        }
    }
    
}
