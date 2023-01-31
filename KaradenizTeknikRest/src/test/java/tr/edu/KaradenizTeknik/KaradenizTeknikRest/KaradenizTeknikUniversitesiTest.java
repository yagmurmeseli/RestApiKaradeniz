package tr.edu.KaradenizTeknik.KaradenizTeknikRest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class KaradenizTeknikUniversitesiTest {

	KaradenizTeknikUniversitesiRestApi karadenizteknikuniversitesiRestApi = new KaradenizTeknikUniversitesiRestApi();
    private static List<String> dersadi = KaradenizTeknikUniversitesiRestApi.dersadi;
    private static List<String> ogrenciadi = KaradenizTeknikUniversitesiRestApi.ogrenciadi;
    private static List<Ogrenci> ogrencidersleri= KaradenizTeknikUniversitesiRestApi.ogrencidersleri;
	@Test
    public void Listele() {
        List<String> sonuc = KaradenizTeknikUniversitesiRestApi.listele();
        assertEquals(dersadi,sonuc);
    }

    @Test
    public void Ekle() {
        String ders = "Biyoloji";
        String sonuc = KaradenizTeknikUniversitesiRestApi.ekle(ders);
        assertEquals("Biyoloji",sonuc);
	}
    @Test
    public void Listele2() {
        List<String> sonuc = KaradenizTeknikUniversitesiRestApi.listele2();
        assertEquals(ogrenciadi,sonuc);
    }
    @Test
    public void Ekleme() {
        String ogrenciadi = "Sudem";
        String sonuc = KaradenizTeknikUniversitesiRestApi.ekle(ogrenciadi);
        assertEquals("Sudem",sonuc);
    }
    @Test
    public void SecimListele3() {
        List<Ogrenci> sonuc = KaradenizTeknikUniversitesiRestApi.listele3();
        assertEquals(ogrencidersleri,sonuc);
    } 
    @Test
    public void DersSecimleriEkleme() {
        String ogrencidersleri = "Mobil Yazılım";
        String sonuc = KaradenizTeknikUniversitesiRestApi.ekle(ogrencidersleri);
        assertEquals("Mobil Yazılım",sonuc);
    }
}


