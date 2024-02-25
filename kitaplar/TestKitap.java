package kitaplar;
public class TestKitap {
    public static void main(String args []){
        Kitaplar k1=new UniversiteKitaplari("kitap1", "2201001");
        k1.fiyatArtisUygula();
        k1.fiyatIndirimUygula();
        System.out.println(k1.getKdv());
        CocukKitaplari ck1=new BoyamaKitaplari("kitap2", "124578");
        System.out.println(ck1.getKdv());
    }
}
