
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    public static void sehirleriTurla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleri_bastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext())System.out.println("Herhangi Sehir Bulunmuyor.");
        
        Boolean cikis = false;
        Boolean ileri = true;
        
        while(!cikis){
            System.out.println("Bir Islem Seciniz");
            islem = scanner.nextInt();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                    
                case 1:
                    if (!ileri){
                        if (iterator.hasNext())
                            iterator.next();
                    }
                    ileri = false;
                    
                    if (iterator.hasNext())System.out.println("Sehre gidiliyor..." + iterator.next());
                    else System.out.println("Gidilecek Sehir Kalmadi.");
                    ileri = true;
                    break;
                
                case 2:
                    if (ileri){
                        if(iterator.hasPrevious()) iterator.previous();
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) System.out.println("Sehre gidiliyor..." + iterator.previous());
                    else System.out.println("Sehir Turu Basladi.");
                    break;
                
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan Cikiliyor...");
                    break;
            }
        }
    }
    
    public static void islemleri_bastir(){
        System.out.println("0| Islemleri Goruntule.\n1| Bir Sonraki Sehre Git.\n2| Bir Onceki Sehre Git.\n3| Uygulamadan Cik.\n---------------------" );
        
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Izmir");
        
        //System.out.println("Islemler:\n_____________________");
        //islemleri_bastir();
        //System.out.println("____________________");
        sehirleriTurla(sehirler);
        
    }
}
