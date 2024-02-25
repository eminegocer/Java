package OnlineAlisveris;

public class Romanlar extends Kitaplar {
    // constructor
    Romanlar(String urunAdi, double fiyat, String marka, String musteriAdi, String adres, String ePosta,
            int urunAdedi, String yazar, int sayfaSayisi, String kitapAdi,String kategori) {
        // super anahtar kelimesiyle üst sınıfın constructor unda alınan parametreler bu sınıftan üst sınıfa gönderilir  
        super(urunAdi, fiyat, marka, musteriAdi, adres, ePosta, urunAdedi, yazar, sayfaSayisi, kitapAdi,kategori);
        setAdres(adres);
        setMusteriAdi(musteriAdi);
        setEPosta(ePosta);
        setKategori(kategori);
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
        this.kitapAdi = kitapAdi;

    } 

    //  IBaskiAl interface sınıfı Kitaplar sınıfına İmplements edildiği için burada fonksiyon override edilip içi doldurulmalı
    public void baskiAl(){
        System.out.println("ROMAN BASKISI ALINABİLİR");
    }
    // overrride
    public void bilgileriYaz(){
        if(alisverisOnayi()){
            super.bilgileriYaz();
            stokGuncelle();
        }else{
            System.out.println(" YETERLİ MİKTARDA ROMAN MEVCUT DEĞİL!!!");
        }
    }
}
