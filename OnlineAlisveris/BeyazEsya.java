package OnlineAlisveris;

public class BeyazEsya extends ElektronikUrun implements IElektrikHarca {
    int oran=45;
    
    // constructor
    BeyazEsya(String urunAdi, double fiyat, String marka, String musteriAdi,  String adres, String ePosta, int urunAdedi,String kategori, int garantiSuresi){
       super( urunAdi,  fiyat,  marka,  musteriAdi,   adres,  ePosta,  urunAdedi, garantiSuresi);
       setAdres(adres);
       setMusteriAdi(musteriAdi);
       setEPosta(ePosta);
       setKategori(kategori);

    }
    // ElektronikUrun sinifına implement edilen interfacein metodu
    public void elektrikHarcar(){
        System.out.println("BEYAZ ESYA ÜRÜNLERİ ELEKTRİK HARCAYABİLİR");
    }

    // override
    public void bilgileriYaz(){
        if(super.garantiOnay() && alisverisOnayi()){
            System.out.println("İSTENİLEN GARANTİ SÜRESİNE UYGUN BEYAZ EŞYA ÜRÜNÜ MEVCUT");
            super.bilgileriYaz();
            stokGuncelle();
        }else{
            System.out.println("İSTENİLEN GARANTİ SÜRESİNE UYGUN VEYA YETERLİ MİKTARDA  BEYAZ EŞYA ÜRÜNÜ MEVCUT DEĞİL!!!");
        }
    }
    
   
}  
