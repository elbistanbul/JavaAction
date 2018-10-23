
public class account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;
    
    public void bilgileriGoster(){
        System.out.println("Hesap No: " + this.hesapNo);
        System.out.println("Bakiye: " + this.bakiye);
        System.out.println("isim: " +this.isim);
        System.out.println("email: " +this.email );
        System.out.println("telNo: " +this.telNo);
    }
    public account(){
        /*this.bakiye = 0.0;
        this.hesapNo = "Bilgi yok";
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.telNo = "Bilgi yok";*/
        //System.out.println("Kendi yazdigimiz constructor...");
        this("Bilgi yok.", 0.0, "Bilgi yok.","Bilgi yok","Bilgi yok.");
    }
    
    public account( String isim, String email, String telNo){
        /*this.isim = isim;
        this.email = email;
        this.telNo = telNo;
        
        this.bakiye = 0.0;
        this.hesapNo = "Bilgi yok.";*/
        
        this("Bilgi yok.", 0.0, isim, email, telNo);
    }
    public account(String hesapNo, double bakiye, String isim, String email, String telNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telNo = telNo;
    }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telno
     */
    public String getTelno() {
        return telNo;
    }

    /**
     * @param telno the telno to set
     */
    public void setTelno(String telno) {
        this.telNo = telno;
    }
    
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
        
    }
    
    public void paraCekme(double miktar){
        if (miktar > 1500) System.out.println("Bir gunde 15000tl den fazla cekemezsiniz");
        else if ((bakiye - miktar) < 0) System.out.println("Yeterli bakiyeniz bulunamamaktatir.\n bakiyeniz: " + bakiye);
        else {
            bakiye -= miktar;
            System.out.println("bakiyeniz: " + bakiye);
        }
        
    }
    
    
    
}
