package OnlineAlisveris;

public class Bilgisayar extends ElektronikUrun {
    private boolean isFreeDOS;
    Boolean isLaptop;

    // constructor
    Bilgisayar(String urunAdi, double fiyat, String marka, String musteriAdi, Boolean isLaptop, Boolean isFreeDOS,
            String adres, String ePosta, int urunAdedi, String kategori, int garantiSuresi) {
        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, garantiSuresi);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);
        setIsFreeDOS(isFreeDOS);
        setIsLaptop(isLaptop);

    } 
    // ElektronikUrun sinifına implement edilen interfacein metodu
    public void elektrikHarcar(){
        System.out.println("BİLGİSAYAR ELEKTRİK HARCAYABİLİR");
    }

    // private tanımlanan değişkene değer atayabilmek için get-set fonksıyonlarından yararlanılır
    boolean getIsLaptop() {
        return isLaptop;
    }

    void setIsLaptop(boolean isLaptop) {
        this.isLaptop = isLaptop;
    }

    boolean getIsFreeDOS() {
        return isFreeDOS;
    }

    void setIsFreeDOS(boolean isFreeDOS) {
        this.isFreeDOS = isFreeDOS;
    }

    // override
    public void bilgileriYaz() {
        if (getIsFreeDOS() && getIsLaptop() && alisverisOnayi()) {
            System.out.println("ISTENİLEN ÖZELLİKTE BİLGİSAYAR MEVCUT");
            System.out.println("Müşteri Adi:" + super.getMusteriAdi());
            System.out.println("Müşteri Adresi:" + super.getAdres());
            System.out.println("Müşteri E-posta:" + super.getEPosta());
            System.out.println("Ürün Kategorisi:" + getKategori());
            System.out.println("Ürün Laptop Mu:" + isLaptop);
            System.out.println("Ürün FreeDOS mu:" + getIsFreeDOS());
            System.out.println("Ürünün GAranti Süresi:" + garantiSuresi);
            System.out.println("Ürün Adi:" + super.urunAdi);
            System.out.println("Ürün Markasi:" + super.marka);
            System.out.println("Ürünün Adet Fiyati:" + fiyat);
            System.out.println("Ürün Adedi:" + super.urunAdedi);
            System.out.println("Ürün Toplam Fiyati:" + super.netFiyat());
            System.out.println("Kargo Firmasi:" + kargoFirmasi);
            stokGuncelle();
        } else {
            System.out.println("ISTENİLEN ÖZELLİKTE VEYA YETERLİ MİKTARDA BİLGİSAYAR MEVCUT DEĞİL!!!");
        }
    }

}
