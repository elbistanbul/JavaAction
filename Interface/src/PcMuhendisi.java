
public class PcMuhendisi implements IMuhendis{
    
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    
    
    @Override
    public void askerlik_durum_sorgula() {
        if (askerlik){
            System.out.println("Askerligimi yaptim.");
        }
        
        else System.out.println("Askerligimi yapamadim.");
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adliSicil)System.out.println("Adli sicil kaydim bukunuyor.");
        else System.out.println("Herhangi bir adli sicil kaydim bulunmuyor");
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar muhendisi olarak su sirketlerde calistim: " );
        for(String s: array) System.out.println(s);
    }
    
    
}
