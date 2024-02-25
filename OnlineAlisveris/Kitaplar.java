package OnlineAlisveris;

public class Kitaplar extends Urun implements IBaskiAl{
    static int KitapStokMiktari=100;
    int sayfaSayisi;
    String yazar;
    String kitapAdi;
    double oran = 54;

    // constructor
    Kitaplar(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta, int urunAdedi,
            String yazar, int sayfaSayisi, String kitapAdi, String kategori) {
        super(urunAdi, fiyat, marka, urunAdedi);
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
        this.kitapAdi = kitapAdi;
    }
    //override
    public void stokEkle(int eklenecekUrunAdedi) {
        KitapStokMiktari += eklenecekUrunAdedi;
        System.out.println("Güncellenmiş Stok Miktari:" + KitapStokMiktari);
    }

    //override
    public void stokGuncelle(){
        if(alisverisOnayi()){
        KitapStokMiktari=KitapStokMiktari-urunAdedi;
        System.out.println("Stokta Kala Ürün Miktari:" + KitapStokMiktari);
        }else{
            System.out.println("alişverş onayi verilemedi");
        }
 
    }
     //override   
    public void fiyatGuncelle() {
        super.fiyat = fiyat + (fiyat * oran) / 100;
        System.out.println("Güncel Adet Fiyati:" + fiyat);
    }
    //override
    public void baskiAl(){
        System.out.println("KİTAP BASKISI ALINABİLİR");
    }
    //override
    public void bilgileriYaz() {
        System.out.println("Müşteri Adi:" + super.getMusteriAdi());
        System.out.println("Müşteri Adresi:" + super.getAdres());
        System.out.println("Müşteri E-posta:" + super.getEPosta());
        System.out.println("Ürünün Kategorisi:" + getKategori());
        System.out.println("Ürün Adi:" + super.urunAdi);
        System.out.println("Kitap Adi:" + this.kitapAdi);
        System.out.println("Kitap Yazari:" + this.yazar);
        System.out.println("Kitap Sayfa Sayisi:" + this.sayfaSayisi);
        System.out.println("Ürün Fiyati:" + super.fiyat);
        System.out.println("Ürün Markasi:" + super.marka);
        System.out.println("Ürün Adedi:" + super.urunAdedi);
        System.out.println("Kargo Firmasi:" + kargoFirmasi);

    }
}