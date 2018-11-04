
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade progamina hosgeldiniz");
        System.out.println("Cikis icin q`ya basiniz");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Hangi Beyblade i uretmek istiyorusunuz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            }
            
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null) System.out.println("Lutfen gecerli bir Beyblade ismi giriniz");
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
