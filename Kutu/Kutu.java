package Abstracts;

public class Kutu {
    private double en;
    private double boy;
    private double yukseklik;

    Kutu(double en, double boy, double yukseklik) {
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }

    public void hacimHesapla(){
        System.out.println("eni:" + en +" boyu:" + boy + " yüksekliği:" + yukseklik+ " olan kutunun hacmi:" + (en*boy*yukseklik)+ " dir");
    }

    public double hacimHesapla2(){
        return (en*boy*yukseklik);
    }
}
