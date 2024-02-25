package kitaplar;

public class DinletiliMasalKitaplari extends MasalKitaplari {
    String yas_araligi;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    DinletiliMasalKitaplari(String adi, String isbn){
        super(adi, isbn);
    }

 void fiyatArtisUygula(){
   fiyat=getFiyat()+getFiyat()*0.7;
   System.out.println("kitabin son fiyati:" + fiyat);
 }

 void fiyatIndirimUygula(){
    fiyat=getFiyat()-getFiyat()*0.14;
   System.out.println("kitabin son fiyati:" + fiyat);
 }

}
