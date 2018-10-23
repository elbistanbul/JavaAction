
public class Return {
    
    public static int carp(int a){
        
        return a*2;
        
    }
    
    public static int topla (int a){
        return a+2;
    }
    
    public static int dortlecarp(int a ){
        return a*4;
    }
    public static void main(String[] args) {
        int sayi = dortlecarp(topla(carp(1)));
        System.out.println("Sonuc:" + sayi);
        
    }
}
