public class Banka_Sinif {
    public int musteri_hesap_no;
    public String musteri_adi;
    public double hesap_bakiye;
    public String hesap_tipi;
    double son_bakiye;

    public void paraCek(double para, String doviz_tipi){
        
        System.out.println("para çekiliyor...\n");
        if(paraCekOnay(para, doviz_tipi)){
            son_bakiye=hesap_bakiye-para;
            System.out.println("para çekme işlemi tamamlandı");
        }else{
            System.out.println("bakiye yetersiz veya hesap tipi uyumsuz");
        }
        System.out.println("--------------------------------------------------");
        islemOzeti( musteri_hesap_no, musteri_adi, hesap_bakiye, son_bakiye,  hesap_tipi,  para);
        System.out.println("--------------------------------------------------");
        hesapOzeti(musteri_hesap_no, musteri_adi, son_bakiye, hesap_tipi);
    }


    public boolean paraCekOnay(double para, String doviz_tipi){
        boolean onay=false;
        if(hesap_bakiye>=para && hesap_tipi.equals(doviz_tipi)){
            onay=true;
        }
       return onay;
    }


    public void paraYatir(double para, String doviz_tipi){
        System.out.println("para yatıyor...\n");
        if(paraYatirOnay(doviz_tipi)){
            System.out.println("para yatırma işlemi tamamlandı");
            son_bakiye=hesap_bakiye+para;
        }else{
            System.out.println("hesap tipi uyumsuz");
            hesapOzeti(musteri_hesap_no, musteri_adi, son_bakiye, hesap_tipi);
            return;
        }
        System.out.println("--------------------------------------------------");
        islemOzeti(musteri_hesap_no, musteri_adi, hesap_bakiye, son_bakiye, hesap_tipi, para);
        System.out.println("--------------------------------------------------");
        hesapOzeti(musteri_hesap_no, musteri_adi, son_bakiye, hesap_tipi);
    }
    public boolean paraYatirOnay(String doviz_tipi){
        boolean onay=false;
        if(hesap_tipi.equals(doviz_tipi)){
            onay=true;
        }
       return onay;
    }

    public void islemOzeti(int musteri_hesap_no,String musteri_adi,double hesap_bakiye,double son_bakiye, String hesap_tipi, double para){
        System.out.println("müşteri numarası:" + musteri_hesap_no);
        System.out.println("müşteri adı:" + musteri_adi);
        System.out.println("ilk bakiye:" + hesap_bakiye + hesap_tipi);
        System.out.println("işlem tutarı:" + para + hesap_tipi);
        System.out.println("güncel bakiye:" + son_bakiye + hesap_tipi);
    }

    public void hesapOzeti(int musteri_hesap_no,String musteri_adi,double son_bakiye, String hesap_tipi){
        System.out.println("müşteri numarası:" + musteri_hesap_no);
        System.out.println("müşteri adı:" + musteri_adi);
        System.out.println("güncel bakiye:" + son_bakiye + hesap_tipi); 
    }

}
