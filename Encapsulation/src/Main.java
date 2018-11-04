
public class Main {
    public static void main(String[] args) {
          /*  Abone abone = new Abone();
            abone.isim = "Muhi";
            abone.bakiye = 100;
            abone.sehir = "izmir";
            
            abone.dogalgazKullan(100);
            abone.bakiyeOgren(); */
          
          GelismisAbone abone = new GelismisAbone("muhi", 120, "izmir");
          abone.bakiyeOgren();
    }
}
