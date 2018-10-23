/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhittin
 */
public class overloading {
    
    static int method1 (int sayi1, int sayi2){
        return sayi2;
    }
    static double method1 (int sayi1, double sayi2){
        return sayi2;
    }
    public static void main(String[] args) {
        System.out.println(method1(5,1));
        System.out.println(method1(68, 5));
    }
}
