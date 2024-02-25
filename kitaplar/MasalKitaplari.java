package kitaplar;

public class MasalKitaplari extends CocukKitaplari {
    boolean isYerli;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
    MasalKitaplari(String adi, String isbn){
        super(adi, isbn);
        super.setKdv(0.20);
        super.setYazari("yazar5");
        super.setBasim_yili(1999);
        super.sayfa_sayisi=850;
        System.out.println("kitap yas araligi:" + yas_araligi);
        super.bilgiYaz();
    }
    void fiyatArtisUygula(){
       fiyat=getFiyat()+getFiyat()*0.62;
       System.out.println("kitabin son fiyati:" + fiyat);
     }

     void fiyatIndirimUygula(){
        fiyat=getFiyat()-getFiyat()*0.6;
       System.out.println("kitabin son fiyati:" + fiyat);
     
    }
    
}
