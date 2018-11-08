
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gokcen Havalimanina hosgeldiniz");
        
        String sartlar = "yurdisi cikis sartlari\n"
                +"- Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor\n"
                +"- 15 Tl harc bedelinizi tam yatirmaniz gerekiyor\n"
                +"- Gideceginiz ulkeye vizenizin bulunmasi gerekiyor";
        
        String mesaj = "Yurt disi sartlarindan hepsini saglamaniz gerekiyor";
        
        while(true){
            System.out.println("******************************");
            System.out.println(sartlar);
            System.out.println("******************************");
            
            
            Yolcu yolcu1 = new Yolcu();
            System.out.println("Harc bedeliniz kontrol edliyor....");
            Thread.sleep(3000);
            if(yolcu1.yurtDisiHarciKontrol()== false){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Siyasi kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu1.siyasiYasakKontrol() == false){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Vize durumu kontrol ediliyor...");
            if (yolcu1.vizeDurumuKontrol() == false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Islemleriniz tamam. yurt disina cikabilirsiniz");
            break;
        }
        
    }
}
