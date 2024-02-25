package OnlineAlisveris;

public class YabanciDilKitaplari extends Kitaplar {
    final String dil = "Ingilizce";

    // constructor
    YabanciDilKitaplari(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta,
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
    //  IBaskiAl interface sınıfı Kitaplar sınıfına İmplements edildiği için burada fonksiyon override edilip içi doldurulmalı
    public void baskiAl(){
        System.out.println("YABANCI DİL KİTAP BASKISI ALINABİLİR");
    }
    
    // override
    public void fiyatAraligiBelirle(int altFiyat, int ustFiyat) {
        if (super.fiyat > altFiyat && super.fiyat < ustFiyat && alisverisOnayi()) {
            System.out.println("İSTENİLEN FİYAT ARALIĞINDA YABANCI DİL KİTABI MEVCUT ");
            System.out.println("Müşteri Adi:" + super.getMusteriAdi());
            System.out.println("Müşteri Adresi:" + super.getAdres());
            System.out.println("Müşteri E-posta:" + super.getEPosta());
            System.out.println("Ürünün Kategorisi:" + getKategori());
            System.out.println("Ürün Adi:" + super.urunAdi);
            System.out.println("Kitap Dili:" + dil);
            System.out.println("Kitap Adi:" + this.kitapAdi);
            System.out.println("Kitap Yazari:" + this.yazar);
            System.out.println("Kitap Sayfa Sayisi:" + this.sayfaSayisi);
            System.out.println("Ürün Fiyati:" + super.fiyat);
            System.out.println("Ürün Markasi:" + super.marka);
            System.out.println("Ürün Adedi:" + super.urunAdedi);
            System.out.println("Kargo Firmasi:" + kargoFirmasi);
            stokGuncelle();
        } else {
            System.out.println("İSTENİLEN FİYAT ARALIĞINDA VEYA YETERLİ MİKTARDA YABANCI DİL KİTABI MEVCUT DEĞİL!!!    ");
        }
    }
}
