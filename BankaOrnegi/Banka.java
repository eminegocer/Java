package BankaOrnegi;

public class Banka {
    String hesapNo;
    String musteriAdi;
    static double butce = 10000;

    Banka(String hesapNo, String musteriAdi) {
        this.hesapNo = hesapNo;
        this.musteriAdi = musteriAdi;
    }

    public void paraYatir(double tutar) {
        butce=butce+tutar;
        System.out.println("Para YAtirma İşlemi Gerçekleşti");
    }

    public void paraCek(double tutar) {
        if(paraCekOnay(tutar)){
            butce=butce-tutar;
            System.out.println("Para Çekme İşlemi Gerçekleştirildi\nGüncel Bakiye " + butce);
        }else{
            System.out.println("Para Cekme İşlemi İçin Butce Yetersiz");
        }
    }
    private boolean paraCekOnay(double tutar){
        boolean onay=true;
        if(tutar>butce){
            onay=false;
        }
        return onay;
    }
    public void goster(){
        System.out.println("Musteri Adi:" + musteriAdi);
        System.out.println("Musteri Hesap Numarasi:" + hesapNo);
        System.out.println("Güncel Hesap Bakiye:" + butce );


    }

}