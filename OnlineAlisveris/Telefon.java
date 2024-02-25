package OnlineAlisveris;

public class Telefon extends ElektronikUrun {
    int hafiza = 128;
    int oran = 35;

    // constructor
    Telefon(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta, int urunAdedi,
            String kategori, int garantiSuresi) {

        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, garantiSuresi);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);

    }

    // IElektrikHarca interface sınıfı ElektronikUrun sınıfına implements edildiği için fonksiyon burada çağırılıp içi dolduruldu
    public void elektrikHarcar(){
        System.out.println("TELEFON ELEKTRİK HARCAYABİLİR");
    }
    // overrride
    public void fiyatGuncelle() {
        super.fiyat = fiyat + (fiyat * oran) / 100;
        System.out.println("Güncel Fİyat:" + fiyat);
    }

    @Override
    public void bilgileriYaz() {
        if(alisverisOnayi()){
            System.out.println("Müşteri Adi:" + super.getMusteriAdi());
            System.out.println("Müşteri Adresi:" + super.getAdres());
            System.out.println("Müşteri E-posta:" + super.getEPosta());
            System.out.println("Ürün Kategorisi:" + getKategori());
            System.out.println("Ürün Adi:" + super.urunAdi);
            System.out.println("Ürünün Garanti Süresi:" + garantiSuresi);
            System.out.println("Ürün Markasi:" + super.marka);
            System.out.println("Ürünün Hafizasi:" + hafiza);
            System.out.println("Ürünün Adet Fiyati:" + fiyat);
            System.out.println("Ürün Adedi:" + super.urunAdedi);
            System.out.println("Ürün Toplam Fiyati:" + super.netFiyat());
            System.out.println("Kargo Firmasi:" + kargoFirmasi);
            stokGuncelle();
        }else{
            System.out.println("STOKTA YETERLİ MİKTARDA TELEFON MEVCUT DEĞİL!!!");
        }
    }

}
