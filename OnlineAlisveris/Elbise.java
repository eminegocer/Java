package OnlineAlisveris;

public class Elbise extends GiyimUrunu {
    double oran=85;
    public Elbise(String urunAdi, double fiyat, String marka, String musteriAdi,  String adres, String ePosta, int urunAdedi,String beden, String renk, String kumasTuru, String kategori){
        super(urunAdi, fiyat, musteriAdi, adres, kategori, ePosta, marka, urunAdedi, beden, renk, kumasTuru);
    }

    @Override
    public void fiyatGuncelle(){
        super.fiyat=fiyat+(fiyat*oran)/100;
        System.out.println("Güncel Fİyat:" + fiyat);
       }
    @Override
    public void bilgileriYaz() {
        if(super.bedenKontrolu() && alisverisOnayi()){
            System.out.println("İSTENİLEN BEDENDE ÜRÜN MEVCUT");
            super.bilgileriYaz();
            stokGuncelle();
        }else{
            System.out.println("İSTENİLEN BEDENDE  VEYA YETERLİ MİKTARDA ELBİSE MEVCUT DEĞİL!!!");
        }
        
    }
}
