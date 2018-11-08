
import java.util.Scanner;


public class Yolcu implements yurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirdiginiz harc bedelini giriniz: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu?( Evet| Hayir)");
        String cevap = scanner.nextLine();
        if(cevap.equalsIgnoreCase("evet")) this.siyasiYasak = true;
        else this.siyasiYasak = false;
        
        System.out.println("Vizeniz buluyor mu? (evet | hayir)");
        String cevap2 = scanner.nextLine();
        if(cevap2.equalsIgnoreCase("evet")) this.vizeDurumu = true;
        else this.vizeDurumu= false;
        
    }
    
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lutfen Yurt disi harcinizi tam yatiriniz");
            return false;
        }
        else {
            System.out.println("Yurtdisi harci tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak == true){
            System.out.println("Siyasi yasaginiz bulunuyor yurt disina cikamazsiniz.");
            return false;
        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor");
            return true;
        }
    }
    
    

    @Override
    public boolean vizeDurumuKontrol() {
        
        if (this.vizeDurumu == true){
            System.out.println("Vize durumu tamam");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir");
            return false;
        }
    }

   
}
