
public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }
    @Override
    void alanHesapla() {
        double alan = Math.pow(kenar, 2);
        System.out.println(getIsim() + "`in alani: " + alan);
    }
    
}
