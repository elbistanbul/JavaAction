
public class parametregonderme {
    
    public static void selamlama(String isim){
        
        System.out.println("Selamlar "+ isim);
    }
    
    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlari: " + (a+b+c));
    }
    
    public static void main(String[] args) {
        selamlama("muhi");
        toplama(2, 3, 4);
    }
    
}
