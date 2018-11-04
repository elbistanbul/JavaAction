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
    
    public static void konustur (Hayvan hayvan){
        System.out.println(hayvan.konus());
}
    public static void main(String[] args) {
        
        /*
        Hayvan hayvan1 = new Kedi("Limon");
        Hayvan hayvan2 = new Kopek ("Comar");
        Hayvan hayvan3 = new At ("Beygir");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        */
        
        konustur(new Kedi("limon"));
        konustur(new Kopek("comar"));
        konustur (new At("Beygir"));
    }
}
