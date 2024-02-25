package OnlineAlisveris;

public class TestSinifi {
    public static void main(String args[]) {
        Urun urun1 = new GiyimUrunu("Pantolon", 400, "Emine", "Hatay/ Hassa", "Kiyafet", "goceremine@gmail.com", "koton", 3, "M", "Siyah", "Kot");
        urun1.bilgileriYaz();
        urun1.fiyatGuncelle(); // metotlarda overrride edilmişse en son override edilen metodu alır bundan dolayı GiyimUrunu sınıfındakı metodu kullanır ve oran değişkenini bu sınıftaki değere göre alır                    
        urun1.stokGuncelle();
        urun1.stokEkle(6);
        urun1.bilgileriYaz(); 
        urun1.stokGuncelle();
        System.out.println("------------------------------------------"); 

        GiyimUrunu urun2 = new Elbise("elbise", 900, "Chanel", "gamze", "Hatay/Hassa", "gamze@gmail.com", 2, "S","kirmizi", "viskon", "kiyafet");                
        urun2.bilgileriYaz();
        urun2.fiyatGuncelle(); // oran değişkenini override edilmiş sınıftaki değeri alir
        urun2.stokEkle(8);
        urun2.stokGuncelle();
        System.out.println("------------------------------------------");

        EvDekorasyonUrunleri urun3 = new EvDekorasyonUrunleri("kitaplik", 450, "bella maison", "sema", "Hatay", "sema@gmail.com", 1, "orta", "kitaplik", "dekorasyon");               
        urun3.bilgileriYaz();
        urun3.fiyatGuncelle();
        System.out.println("ürün için boyut kontrolü:" + urun3.boyutKontrolu());
        System.out.println("------------------------------------------");

        EvDekorasyonUrunleri urun4 = new Aydinlatma("avize", 165, "apliqa", "gülsüm", "kocaeli", "gulsum@gmail.com", 3, "büyük", "özel tasarim", "aydinlatma");
        urun4.bilgileriYaz();
        urun4.fiyatGuncelle();
        urun4.stokGuncelle();
        System.out.println("------------------------------------------");

        EvDekorasyonUrunleri urun5 = new Mobilya("mobilya", 50000, "mondi", "zeynep", "Hassa", "zeynep@gmail.com", 1,"küçük", "mobilya", "mobilya");                
        urun5.bilgileriYaz();
        urun5.fiyatGuncelle();
        System.out.println("ürün alişverişi için onay:" + urun5.alisverisOnayi());
        System.out.println("------------------------------------------");

        BeyazEsya urun6 = new BeyazEsya("buzdolabi",14990,"arçelik","aylin","Kahramanmaraş","aylin@gmail.com",1,"beyaz eşya",1);
        urun6.bilgileriYaz();
        urun6.fiyatGuncelle();
        urun6.elektrikHarcar();
        urun6.ekGaranti(6);
        System.out.println("ürün garanti süresi onayi:" + urun6.garantiOnay());
        urun6.stokEkle(4);
        urun6.stokGuncelle();
        System.out.println("------------------------------------------");

        ElektronikUrun urun7 = new BeyazEsya("camaşir makinesi", 6000, "beko", "alper", "malatya", "alper@gmail.com", 2, "beyaz eşya", 3);
        urun7.bilgileriYaz();
        urun7.ekGaranti(5);
        urun7.elektrikHarcar();
        urun7.fiyatGuncelle();
        System.out.println("------------------------------------------");

        Bilgisayar urun8 = new Bilgisayar("bilgisayar", 25900, "monster", "bestami", true, true, null, "mersin", 1, "elektronik cihaz", 4);
        urun8.bilgileriYaz();
        System.out.println("ürün alişverişi için onay:" + urun8.alisverisOnayi());
        urun8.ekGaranti(2);
        urun8.fiyatGuncelle();
        System.out.println("------------------------------------------");

        CocukKitaplari urun9=new CocukKitaplari("cocuk kitabi", 35, "iş bankasi yayinlari", "hilal", "gaziantep", "hilal@gmail.com", 2,"lewis caroll", 110, "alice harikalar diyarinda", "kitap");
        urun9.bilgileriYaz();
        urun9.baskiAl();
        urun9.fiyatGuncelle();
        urun9.stokGuncelle();
        System.out.println("------------------------------------------");
      
        Kitaplar urun10=new Romanlar("roman", 85, "iş bankasi yayinlari", "yaren", "istanbul", "yaren@gmail.com", 1, "victor hugo", 280, "sefiller", "kitap");
        urun10.bilgileriYaz();
        urun10.fiyatGuncelle();
        System.out.println("------------------------------------------");
      
        Telefon urun11=new Telefon("telefon", 6500, "redmi", "göktuğ", "kocaeli", "goktuğ@gmail.com", 2, "telefon", 4);
        urun11.bilgileriYaz();
        urun11.elektrikHarcar();
        urun11.stokEkle(7);
        urun11.fiyatGuncelle();
        System.out.println("------------------------------------------");
      
        Kitaplar urun12=new Romanlar("roman", 40, "iş bankasi yayinlari", "ali", "konya", "ali@gmail.com", 2, "gorge orwell", 120, "hayvan çiftliği", "kitap");
        urun12.baskiAl();
        urun12.bilgileriYaz();
        urun12.fiyatGuncelle();
        System.out.println("------------------------------------------");
      
        GiyimUrunu urun13= new Elbise("askili Elbise", 250, "Zara", "Eylül", "muğla", "eylül@gmail.com", 1, "S", "siyah","örme", "kiyafet");
        urun13.bilgileriYaz();
        urun13.fiyatGuncelle();
        urun13.bilgileriYaz();
        System.out.println("-----------------------------------------");

        Kitaplar urun14=new CocukKitaplari("cocuk kitabi", 50, "iş bankasi yayinlari", "kübra", "antalya","kübra@gmail.com",4, "antoine de saint exupery", 60, "küçük prens", "kitap");
        urun14.bilgileriYaz();
        urun14.stokEkle(5);
        urun14.bilgileriYaz();
         
         
    
    }
}
