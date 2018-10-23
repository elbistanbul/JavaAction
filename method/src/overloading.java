
public class overloading {
    public static void toplama(int a, int b, int c){
        System.out.println("Toplam:" + (a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("Toplam:" + (a+b));
    }
    
    public static void toplama (String a, String b){
        System.out.println("String toplamalari:" + (a +" "+ b));
    }
    
    public static void main(String[] args) {
        
        toplama(1, 2, 3);
        toplama(1, 2);
        toplama("muhiddin", "havan");
    }
}
