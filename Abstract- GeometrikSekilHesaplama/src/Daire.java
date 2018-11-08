
public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        double alan = Math.PI * Math.pow(yaricap, 2);
        System.out.println(getIsim() + "`alani: " + alan);
    }
    
    
}
