package kitaplar;
public class UniversiteKitaplari extends Kitaplar{
    Boolean isOriginal;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    UniversiteKitaplari(String adi, String isbn){
        super(adi, isbn);
        super.setFiyat(fiyat);
        super.setKdv(0.20);
        super.setYazari("yazar1");
        super.setBasim_yili(1998);
        super.sayfa_sayisi=850;
        System.out.println("kitap orijinal mi:" + isOriginal);
        super.bilgiYaz();
    }
    void fiyatArtisUygula(){
       fiyat=getFiyat()+getFiyat()*0.3;
       System.out.println("kitabin son fiyati:" + fiyat);
     }

     void fiyatIndirimUygula(){
        fiyat=getFiyat()-getFiyat()*0.3;
       System.out.println("kitabin son fiyati:" + fiyat);
     }
}
