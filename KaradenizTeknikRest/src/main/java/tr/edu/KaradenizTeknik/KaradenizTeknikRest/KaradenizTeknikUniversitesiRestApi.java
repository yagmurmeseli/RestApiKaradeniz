package tr.edu.KaradenizTeknik.KaradenizTeknikRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class KaradenizTeknikUniversitesiRestApi {
	public static List<String> dersadi = new ArrayList<>();
	public static List<String> ogrenciadi = new ArrayList<>();
	public static List<Ogrenci> ogrencidersleri = new ArrayList<>();
    
	{
		dersadi.add("Edebiyat");
		dersadi.add("Kimya");
		ogrenciadi.add("Yagmur");
		ogrenciadi.add("Turgut");
		ogrencidersleri.add(new Ogrenci("Umut", "Türkçe"));
        ogrencidersleri.add(new Ogrenci("Selma", "Müzik"));
		
}
	@GetMapping("/listele")
    public static List<String> listele(){
        return dersadi;
        
    }
    
    @PostMapping("/ekle")
    public static String ekle(@RequestBody String ders) {
	dersadi.add(ders);
    return ders;
}
    @GetMapping("/ogrencilistele")
    public static List<String> listele2(){
        return ogrenciadi;
        
    }
    @PostMapping("/ogrenciekle")
    public static String ekleme(@RequestBody String ogrenciler) {
	ogrenciadi.add(ogrenciler);
    return ogrenciler;
    }
    @GetMapping("/derssecimlistele")
    public static List<Ogrenci> listele3(){
        return ogrencidersleri;
    }
    @PostMapping("/derssecimekle")
    public static Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
	ogrencidersleri.add(ogrenci);
    return ogrenci;
    }

	
	}
