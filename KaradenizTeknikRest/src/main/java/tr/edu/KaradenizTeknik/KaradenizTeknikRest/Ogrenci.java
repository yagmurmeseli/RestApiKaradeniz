package tr.edu.KaradenizTeknik.KaradenizTeknikRest;

public class Ogrenci {
	public String ogrenciadi;
    public String dersadi;
    
    public Ogrenci(String ogrenciadi, String dersadi) {
        super();
        this.ogrenciadi = ogrenciadi;
        this.dersadi = dersadi;
    }

 

    public String getOgrenciadi() {
        return ogrenciadi;
    }

 

    public String getDersadi() {
        return dersadi;
    }
}
