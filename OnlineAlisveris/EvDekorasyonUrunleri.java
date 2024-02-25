package OnlineAlisveris;

public class EvDekorasyonUrunleri extends Urun {
    static int DekStokMiktari=100;
    String boyut="orta";
    String tasarimTuru;
    double oran = 80;

    // constructor
    EvDekorasyonUrunleri(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta,
            int urunAdedi, String boyut,  String kategori,String tasarimTuru) {
        super(urunAdi, fiyat, marka, urunAdedi);
        this.tasarimTuru = tasarimTuru;
        // set fonksıyonları ıle private olan değişkenlere değer atanır
        setAdres(adres);
        setEPosta(ePosta);
        setKategori(kategori);
        setMusteriAdi(musteriAdi);
    }
    // override
    public void stokEkle(int eklenecekUrunAdedi) {
        DekStokMiktari += eklenecekUrunAdedi;
        System.out.println("Güncellenmiş Stok Miktari:" + DekStokMiktari);
    }
    // override
    public void stokGuncelle(){
        if(alisverisOnayi() && boyutKontrolu()){
        DekStokMiktari=DekStokMiktari-urunAdedi;
        System.out.println("Stokta Kala Ürün Miktari:" +DekStokMiktari );
        }else{
            System.out.println("alişveriş onayi verilemedi");
        }
    }

    //override
    public void fiyatGuncelle() {

        super.fiyat = fiyat + (fiyat * oran) / 100;
        System.out.println("Güncel Fiyat:" + fiyat);
    }

    public boolean boyutKontrolu() {
        boolean onay = false;
        if ((boyut.equals("orta")) || (boyut.equals("küçük")) || (boyut.equals("büyük"))) {
            onay = true;
        }
        return onay;
    }

    //override
    public void bilgileriYaz() {
        System.out.println("Müşteri Adi:" + super.getMusteriAdi());
        System.out.println("Müşteri Adresi:" + super.getAdres());
        System.out.println("Müşteri E-posta:" + super.getEPosta());
        System.out.println("Ürün Kategorisi:" + getKategori());
        System.out.println("Ürün Adi:" + super.urunAdi);
        System.out.println("Ürün Markasi:" + super.marka);
        System.out.println("Ürün Boyut:" + this.boyut);
        System.out.println("Ürün Tasarim Türü:" + this.tasarimTuru);
        System.out.println("Ürünün Adet Fiyati:" + fiyat);
        System.out.println("Ürün Adedi:" + super.urunAdedi);
        System.out.println("Ürün Toplam Fiyati:" + super.netFiyat());
        System.out.println("Kargo Firmasi:" + kargoFirmasi);

    }
}
