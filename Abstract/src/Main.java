
public class Main {
    public static void main(String[] args) {
        
        //Sekil sekil = new Sekil(); olusturlamaz abstract clasalardan obje olusturulamaz!!!!!!
        Sekil sekil;
        sekil = new Kare("Kare2", 6);
        sekil.alan_hesapla();
        
        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        
        kare1.cevre_hesapla();
        //sekil.cevre_hesapla();///sekil referansi Sekil clasindan yapildigindan ve Sekil classinda cevre_hesapla method
                                ///olmadigindan dolayi hata verir
                                ///bu sekilde bir tanimlama yapamayiz.!!!!!!!!!!
    }
}
