package OnlineAlisveris;

public class CocukKitaplari extends Kitaplar {
    double oran = 36;

    // constructor
    CocukKitaplari(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta,
            int urunAdedi, String yazar, int sayfaSayisi, String kitapAdi, String kategori) {

        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, yazar, sayfaSayisi, kitapAdi, kategori);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
        this.kitapAdi = kitapAdi;

    }

    // kitaplar sınıfına impelent edilen interface deki metodun içi dolduruldu
    public void baskiAl() {
        System.out.println("COCUK KİTAPLARINDAN BASKI ALINABİLİR");
    }
 
    // overrride
    public void bilgileriYaz() {
        if (alisverisOnayi()) {
            super.bilgileriYaz();
            stokGuncelle();
        } else {
            System.out.println("YETERLİ MİKTARDA COCUK KİTABİ STOKA MEVCUT DEĞİLDİR");
        }
    }
}
