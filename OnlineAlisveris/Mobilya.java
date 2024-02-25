package OnlineAlisveris;

public class Mobilya extends EvDekorasyonUrunleri {

    // constructor
    Mobilya(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta, int urunAdedi,
            String boyut, String tasarimTuru, String kategori) {
        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, boyut,kategori, tasarimTuru);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);
    }
 // override
    public void bilgileriYaz() {
        if (super.boyutKontrolu() && alisverisOnayi()) {
            System.out.println("İSTENİLEN BOYUTTA MOBİLYA ÜRÜNÜ MEVCUT");
            super.bilgileriYaz();
            stokGuncelle();
        } else {
            System.out.println("İSTENİLEN BOYUTTA  VEYA YETERLİ MOBİLYA ÜRÜNÜ MEVCUT DEĞİL!!!");
        }
    }
}
