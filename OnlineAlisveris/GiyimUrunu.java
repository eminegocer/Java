package OnlineAlisveris;

public class GiyimUrunu extends Urun {
    static int giyimStokMiktari=100;
    String beden;
    String renk;
    String kumasTuru;
    double oran=3;

    // contructor
    GiyimUrunu(String urunAdi, double fiyat,String musteriAdi,String adres, String kategori,String  ePosta ,String marka, int urunAdedi,String beden, String renk, String kumasTuru){
        super(urunAdi, fiyat, marka, urunAdedi);
        this.beden=beden;
        this.renk=renk;
        this.kumasTuru=kumasTuru;
        setAdres(adres);
        setEPosta(ePosta);
        setKategori(kategori);
        setMusteriAdi(musteriAdi);
        
    }
    //override
    public void stokEkle(int eklenecekUrunAdedi) {
        giyimStokMiktari += eklenecekUrunAdedi;
        System.out.println("Güncellenmiş Stok Miktari:" +giyimStokMiktari);
    }
    // override
    public void stokGuncelle(){
        if(alisverisOnayi() && bedenKontrolu()){
        giyimStokMiktari=giyimStokMiktari-urunAdedi;
        System.out.println("Stokta Kala Ürün Miktari:" + giyimStokMiktari);
        }else{
            System.out.println("alişveriş için onay verilemedi");
        }
    }

    public boolean bedenKontrolu(){
        boolean onay=false;
        if((beden.equals("M")) || (beden.equals("S")) || (beden.equals("L")) ){
           onay=true;
        }
        return onay;
    }
    // override
    public void fiyatGuncelle(){

        super.fiyat=fiyat+(fiyat*oran)/100;
        System.out.println("Güncel Adet  Fiyati:" + fiyat);
       }
       // override
    public void bilgileriYaz(){
        System.out.println("Müşteri Adi:" + super.getMusteriAdi());
        System.out.println("Müşteri Adresi:" + super.getAdres());
        System.out.println("Müşteri E-posta:" + super.getEPosta());
        System.out.println("Ürünün KAtegorisi:" + getKategori());
        System.out.println("Ürün Adi:" + super.urunAdi);
        System.out.println("Ürün Adet Fiyati:" + fiyat);
        System.out.println("Ürün Adedi:" + super.urunAdedi);
        System.out.println("Ürünlerin Toplam Fiyati:" + super.netFiyat());
        System.out.println("Ürün Markasi:" + super.marka);
        System.out.println("Ürün Bedeni:" + this.beden);
        System.out.println("Ürün Rengi:" + this.renk);
        System.out.println("Ürün Kumas Türü:" + this.kumasTuru);

    
       }
}
