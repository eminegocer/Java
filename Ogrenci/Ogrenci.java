package Abstracts;

public class Ogrenci {
    int ogrenciNo;
    String isim;
    double burs;
    String ders;

    Ogrenci(int ogrenciNo, String isim, double burs) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.burs = burs;
    }

    // overLoading
    Ogrenci(int ogrenciNo, String isim, double burs, String ders) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.burs = burs;
        this.ders = ders;
    }

    public void bilgileriGoster() {
        System.out.println("Öğrenci adi:" + isim);
        System.out.println("Öğrenci numarasi:" + ogrenciNo);
        System.out.println("Öğrenci bursu:" + burs);
        System.out.println("dersi:" + ders);

    }
}
