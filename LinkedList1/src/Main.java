import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        
       /*
        
        ArrayList<String> diller = new ArrayList<String> ();
        
        diller.add("Java");
        diller.add("PHP");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
        */
        
        /*for (int i = 0; i < diller.size(); i++){
            System.out.println(diller.get(i)); */
        
        /*
        for (String s: diller) System.out.println(s);
        System.out.println("Birinci indekse C++ ekleyelim \n --------------------------");
        
        diller.add(1,"C++");
        for (String s: diller) System.out.println(s);
        
        */
        
        
        
        /*
        LinkedList<String> gidilecek_yerler = new LinkedList<String> ();
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kutuphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");
        System.out.println("---------------------");
        gidilecek_yerler.add(4,"AlisVeris Merkezi");
        gidilecek_yerler.remove(3);
        listeyiBastir(gidilecek_yerler);
        //for (String s: gidilecek_yerler) System.out.println(s);
        */
        
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        
        siraliEkle(gidilecek_yerler, "Banka");
        siraliEkle(gidilecek_yerler, "Market");
        siraliEkle(gidilecek_yerler, "Postane");
        siraliEkle(gidilecek_yerler, "Eczane");
        siraliEkle(gidilecek_yerler, "Nalbur");
        siraliEkle(gidilecek_yerler, "Kafe");
        listeyiBastir(gidilecek_yerler);
    }
    
    public static void siraliEkle(LinkedList<String> liste, String yeni_liste){
        ListIterator<String> iterator = liste.listIterator();
        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni_liste);
            
            if(karsilastir == 0){
                // iki deger esitse
                System.out.println("Listeniz de bu deger zaten var.");
                return;
            }
            
            else if (karsilastir < 0 ){
                // Yeni deger iterator .next ten daha buyuk.
            }
            
            else if (karsilastir > 0){
                iterator.previous();
                iterator.add(yeni_liste);
                return;
            }
        }
        iterator.add(yeni_liste);
        
    }
    
    public static void listeyiBastir(LinkedList<String> liste){
        //for(String s: liste) System.out.println(s);
        
        ListIterator<String> iterator = liste.listIterator();
        
        while(iterator.hasNext()) System.out.println(iterator.next());
        
    }
}
