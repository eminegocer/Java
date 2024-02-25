package kitaplar;
public class YabanciDliKitaplari extends Kitaplar{
    boolean isExercise;
    private double fiyat;
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    YabanciDliKitaplari(String adi, String isbn){
        super(adi, isbn);
        super.setFiyat(fiyat);
        super.setKdv(0.20);
        super.setYazari("yazar1");
        super.setBasim_yili(1988);
        super.sayfa_sayisi=810;
        System.out.println("kitap egzersiz içeriyor mu:" + isExercise);
        super.bilgiYaz();
    }
    void fiyatArtisUygula(){
        fiyat=getFiyat()+getFiyat()*0.25;
        System.out.println("kitabin son fiyati:" + fiyat);
    }
    void fiyatIndirimUygula(){
        fiyat=getFiyat()-getFiyat()*0.25;
        System.out.println("kitabin son fiyati:" + fiyat);
    }
}
