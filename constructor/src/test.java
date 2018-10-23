
public class test {
    public static void main(String[] args) {
        account account1 = new account();
        /*account account2 = new account("1234", 1000, "muhi", "el...l@outlook.com", "+90555666444");
        System.out.println("bakiyeniz:" + account2.getBakiye());
        account2.paraCekme(300);
        System.out.println("bakiyeniz:" + account2.getBakiye());
        account2.paraCekme(13000);*/
        
        
        //System.out.println("isim:" + account1.getIsim());
    
        account account2 = new account("muhi","muhi@gmail.com","234131");
        //System.out.println("kullanici isim ve telefon numarasi-->" + account2.getIsim()+" ||| "+ account2.getTelno()+" ||| "+ account2.getHesapNo() );
    
        account2.bilgileriGoster();
    }
}
