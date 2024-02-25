package kitaplar;

public class PastelBoyamaKitaplari extends BoyamaKitaplari {
    String yas_araligi;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    PastelBoyamaKitaplari(String adi, String isbn){
        super(adi, isbn);

    }
    void fiyatArtisUygula(){
       fiyat=getFiyat()+getFiyat()*0.5;
       System.out.println("kitabin son fiyati:" + fiyat);
     }

     void fiyatIndirimUygula(){
        fiyat=getFiyat()-getFiyat()*0.18;
       System.out.println("kitabin son fiyati:" + fiyat);
     
    }
}
