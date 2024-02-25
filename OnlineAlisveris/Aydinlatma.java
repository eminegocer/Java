package OnlineAlisveris;

// constructor
public class Aydinlatma extends EvDekorasyonUrunleri implements IAydinlat, IElektrikHarca{
    int oran=45;
    // constructor
     Aydinlatma(String urunAdi, double fiyat, String marka, String musteriAdi,  String adres, String ePosta, int urunAdedi, String boyut,String tasarimTuru, String kategori){
        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, boyut,kategori, tasarimTuru);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);
    }

    // bu sinifa implement edilen IAydinlat interfaceinin metodu
    public void aydinlatir(){
        System.out.println("EV DEKORASYON ÜRÜNLERİNİN ALT SINIFI OLAN AYDINLATMA ÜRÜNLERİ IŞIK VERİR");
    }
    // bu sinifa implement edilen IElektrikHarca interfaceinin metodu 
    public void elektrikHarcar(){
        System.out.println("AYDİNLATMA ÜRÜNLERİ ELEKTRİK HARCAYABİLİR");
    }
    public void bilgileriYaz(){
        if(super.boyutKontrolu() && alisverisOnayi()){
            System.out.println("İSTENİLEN BOYUTTA AYDİNLATMA ÜRÜNÜ MEVCUT");
            super.bilgileriYaz();
            super.stokGuncelle();
        }else{
            System.out.println("İSTENİLEN BOYUTTA AYDİNLATMA ÜRÜNÜ VEYA YETERLİ MİKTARDA AYDİNLATMA ÜRÜN MEVCUT DEĞİL!!!");
        }
    }
}
