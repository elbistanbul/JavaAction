
public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu){
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDunusHizi() {
        return donusHizi;
    }

    public void setDunusHizi(int dunusHizi) {
        this.donusHizi = dunusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir(){
        System.out.println(getBeybladeci() + " " + "saldiri gucu: " + saldiriGucu + " ve "+ "donus hizi:" + donusHizi+ "." );
    }
    
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu Beyblade`in kutsal canavari bulunmuyor.");
    }
    
    public void bilgileriGoster(){
        System.out.println("Beybladeci isim: " + beybladeci);
        System.out.println("Saldiri gucu: " + saldiriGucu);
        System.out.println("Donus hizi: " + donusHizi);
    }
}
