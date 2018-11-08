
public class Main {

    public static void main(String[] args) {

        //IMuhendis muhendis1 = new IMuhendis(); interface de obje olusturualamaz.
        /*
        IMuhendis muhendis1 = new PcMuhendisi(false, false);
        muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_durum_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(2.15));
        
        String[] tecrube = {"Sade ARGE", "Telcoset", "Airmind"};
        muhendis1.is_tecrubesi(tecrube);
         */
        
        /*
        MakineMuhendis muhendis2 = new MakineMuhendis(true, false);

        String[] tecrube = {};
        String[] referans = {"AKadir", "Alperen", "Okkus", "Emre"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durum_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.1));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();
        */
        
        IMuhendis muhendis2 = new MakineMuhendis(true, false);

        String[] tecrube = {};
        String[] referans = {"AKadir", "Alperen", "Okkus", "Emre"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durum_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.1));
        muhendis2.is_tecrubesi(tecrube);
        ((MakineMuhendis)muhendis2).referans_getir(referans);
        ((MakineMuhendis)muhendis2).calis();
        
    }
}
