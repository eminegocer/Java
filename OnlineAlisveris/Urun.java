package OnlineAlisveris;

public abstract class Urun {
    String urunAdi;
    double fiyat;
    String marka;
    private String kategori;
    public final String kargoFirmasi = "Sürat Kargo";
    static int stokMiktari = 100;
    private String musteriAdi;
    private String adres;
    private String ePosta;
    int urunAdedi;
    double oran = 9;

    // constructor
    Urun(String urunAdi, double fiyat, String marka, int urunAdedi) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.marka = marka;
        this.urunAdedi = urunAdedi;
    }

    // get-set fonksiyonları private olan özelliklere erişebilmeyi sağlar
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEPosta() {
        return ePosta;
    }

    public void setEPosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public boolean alisverisOnayi() {
        boolean onay = false;
        if (urunAdedi <= stokMiktari) {
            onay = true;
        }
        return onay;
    }

    void fiyatGuncelle() {
        fiyat = fiyat + (fiyat * oran) / 100;
        System.out.println("Güncel Fİyat:" + fiyat);
    }

    // abtract metotlar sadece abstract sınıflarda tanımlanabilir. Metot abstract olarak tanımlanmışsa gövdesi olmaz. Türetilen sınıflarda override edilerek metotların içi doldurulur
    abstract void stokGuncelle();

    public double netFiyat() {
        return urunAdedi * fiyat;
    }

    public abstract void stokEkle(int eklenecekUrunAdedi);

    public abstract void bilgileriYaz();
}
