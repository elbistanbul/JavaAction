package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bankamiza hosgeldiniz faiz orani %6");

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
