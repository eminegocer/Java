package OnlineAlisveris;

public class ElektronikUrun extends Urun implements IElektrikHarca{
    static int ElektronikStokMiktari=100;
    int garantiSuresi;
    double oran = 75;

    ElektronikUrun(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta,
            int urunAdedi, int garantiSuresi) {
        super(urunAdi, fiyat, marka, urunAdedi);
        this.garantiSuresi=garantiSuresi;
    }

    // override
    public void fiyatGuncelle() {
        super.fiyat = fiyat + (fiyat * oran) / 100;
        System.out.println("Güncel Fİyat:" + fiyat);
    }
    // sunufa impleme edilen interfacedeki metodun içi dolduruluyor
    public void elektrikHarcar(){
        System.out.println("ELEKTRONİK ÜRÜNLER ELEKTRİK HARCAYABİLİR");
    }
    // override
    public void stokEkle(int eklenecekUrunAdedi) {
        ElektronikStokMiktari += eklenecekUrunAdedi;
        System.out.println("Güncellenmiş Stok Miktari:" + ElektronikStokMiktari);
    }
    //override
    public void stokGuncelle(){
        if(alisverisOnayi() && garantiOnay()){
        ElektronikStokMiktari=ElektronikStokMiktari-urunAdedi;
        System.out.println("Stokta Kala Ürün Miktari:" + ElektronikStokMiktari);
        }else{
            System.out.println("alişveriş için onay verilemedi");
        }
    }

    public boolean garantiOnay() {
        boolean onay = true;
        if (garantiSuresi < 2) {
            onay = false;
        }
        return onay;
    }
 
    public void ekGaranti(int ekGarantiSuresi) {
        fiyat = super.fiyat + (ekGarantiSuresi * 250);
        System.out.println("Ek Garanti Dahil Adet Ücreti:" + fiyat);
    }

    // Override
    public void bilgileriYaz() {
        System.out.println("Müşteri Adi:" + super.getMusteriAdi());
        System.out.println("Müşteri Adresi:" + super.getAdres());
        System.out.println("Müşteri E-posta:" + super.getEPosta());
        System.out.println("Ürün Kategorisi:" + getKategori());
        System.out.println("Ürün Adi:" + super.urunAdi);
        System.out.println("Ürünün GAranti Süresi: "+ garantiSuresi);
        System.out.println("Ürün Markasi:" + super.marka);
        System.out.println("Ürünün Adet Fiyati:" + fiyat);
        System.out.println("Ürün Adedi:" + super.urunAdedi);
        System.out.println("Ürün Toplam Fiyati:" + super.netFiyat());
        System.out.println("Kargo Firmasi:" + kargoFirmasi);
    }
}
