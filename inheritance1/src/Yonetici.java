
public class Yonetici extends Calisan {
    
    private int sorumlu_kisi;
    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println("Calisanlara " + zam_miktari + " tl zam yapildi.");
    }
    
    public void bilgileriGoster(){
//        System.out.println("isim : " + getIsim());
//        System.out.println("Maas : " + getMaas());
//        System.out.println("Departman : " + getDepartman());
            super.bilgileriGoster();
            System.out.println("Sorumlu kisi sayisi : " + this.sorumlu_kisi);
        
        
    }
}
