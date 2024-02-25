package kitaplar;
public class BoyamaKitaplari extends CocukKitaplari{
    String turu;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    BoyamaKitaplari(String adi, String isbn){
        super(adi, isbn);
        super.setKdv(0.23);
        super.setYazari("yazar4");
        super.setBasim_yili(1799);
        super.sayfa_sayisi=857;
        System.out.println("kitap yas araligi:" + yas_araligi);
        super.bilgiYaz();
    }
}
