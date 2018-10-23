
public class test {
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        araba1.setModel("Renault");
        System.out.println("Arabamizin modeli " + araba1.getModel());
        
        araba1.setKapi(-1);
        araba1.setKapi(4);
        System.out.println("Arabanin kapi sayisi: " + araba1.getKapi());
        
        Araba araba2 = null;
        araba2.setModel("mercedes");
        
    }
    
}
