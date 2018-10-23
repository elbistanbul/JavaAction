/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.algorithm;

/**
 *
 * @author muhittin
 */
public class bublesort {
    
    
    public void bubblesort(int [] A) // bir diziyi parametre alan fonksiyon
  {

     int tmp;

    for(int i=0; i<A.length; i++)
    {
  //    for(int j=1; j<A.length-i+1; j++) şeklinde de döngü yazılabilir
        for(int j=A.length-1 ; j>i;j--) //i'ye kadar olan kısmı sabitlendiği için tekrar geçişlerde kontrolü gerekmemektedir.
      {
        if(A[j-1]>A[j])
        {
          tmp=A[j-1];
          A[j-1]=A[j];
          A[j]=tmp;
        }
      }
    }
  }
    public static void main(String[] args) {
        
    }
}
