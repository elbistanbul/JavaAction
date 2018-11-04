class Hayvan {
    private String isim;

    public Hayvan() {
    }
    public Hayvan (String isim){
        this.isim = isim;
    }
    
    public String getIsim(){
        return isim;
    }
    
    public void setIsim (String isim){
        this.isim = isim;
    }
    
    public String konus (){
        return "Hayvan konusuyor.....";
    }
    
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavliyor";//To change body of generated methods, choose Tools | Templates.
    }
   
   


} 

class At extends Hayvan {

        public At(String isim) {
            super(isim);
        }

        /*
        @Override
        public String konus() {
            return this.getIsim() + " At kisniyor.."; //To change body of generated methods, choose Tools | Templates.
        }
        */
    }
class Kopek extends Hayvan {

        public Kopek(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " kopek havliyor..."; //To change body of generated methods, choose Tools | Templates.
        }
        
    }

public class Main {
    
    public static void konustur (Object object){
        
       // System.out.println(hayvan.konus());
        
       if (object instanceof Kopek){
           Kopek kopek = (Kopek)object;
           System.out.println(kopek.konus());
       }
       
       else if (object instanceof Kedi){
           Kedi kedi = (Kedi) object;
           System.out.println(kedi.konus());
       }
       
       else if (object instanceof At){
           At at = (At) object;
           System.out.println(at.konus());
       }
       
       else if (object instanceof Hayvan){
           Hayvan hayvan = (Hayvan)object;
           System.out.println(hayvan.konus());
       }
}
    public static void main(String[] args) {
       
        /*
        Kopek kopek = new Kopek ("Comar");
        
        if (kopek instanceof Kopek) System.out.println("Bu nesne Kopek sinifindan .....");
    */
        
        Kopek kopek = new Kopek("Comar");
        Kedi kedi = new Kedi("Limon");
        At at = new At("Beygir");
        Hayvan hayvan = new Hayvan("Limon");
        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
    }
}
