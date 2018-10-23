/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizuygulamasi;
import java.util.Scanner;
/**
 *
 * @author muhittin
 */
public class FaizUygulamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza hosgeldiniz bankamizin faiz orani 6%");

        int anapara, vade;
        System.out.printf("yatimak istediginiz tutar:");
        anapara = scanner.nextInt();
        System.out.printf("Paranizi kac yil vadeli yatirma istiyorsunuz?");
        vade = scanner.nextInt();

        double toplamPara = anapara;

        double faizorani = 0.06;

        for (int i=0 ; i <= vade ; i++)
        {
         toplamPara = (toplamPara * faizorani) +toplamPara;

            System.out.printf(i + "yilin sonunda yoplma para:" + toplamPara );
        }



        System.out.printf("Muhiddin havan ");
    }
    
}
