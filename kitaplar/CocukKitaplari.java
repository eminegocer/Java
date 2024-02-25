package kitaplar;
public class CocukKitaplari extends Kitaplar {
    String yas_araligi;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    CocukKitaplari(String adi, String isbn){
        super(adi, isbn);
        super.setKdv(0.20);
        super.setYazari("yazar3");
        super.setBasim_yili(1999);
        super.sayfa_sayisi=850;
        System.out.println("kitap yas araligi:" + yas_araligi);
        super.bilgiYaz();
    }
    void fiyatArtisUygula(){
       fiyat=getFiyat()+getFiyat()*0.06;
       System.out.println("kitabin son fiyati:" + fiyat);
     }

     void fiyatIndirimUygula(){
        fiyat=getFiyat()-getFiyat()*0.06;
       System.out.println("kitabin son fiyati:" + fiyat);
     
    }
}
