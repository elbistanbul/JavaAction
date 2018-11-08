
public class MakineMuhendis implements IMuhendis, ICalisma {  
    
    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendis(boolean askerlik, boolean adliSicil) {
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
        if(array.length == 0) System.out.println("Herhangi bir is tecrubem bulunmuyor");
        else for(String s: array) System.out.println("Is tecrubelerim: \n" + s);
    }
    
    public void referans_getir(String[] array){
        if (array.length == 0) System.out.println("Herhangi bir referansim bulunmuyor");
        else {
            System.out.println("Referanslarim: ");
            for (String s: array) System.out.println(s);
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine muhendisi calisiyor.");
    }
}
