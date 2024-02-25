package abstracts;

public class MainTest {
    public static void main(String args []){
       // Sekiller sekil1=new Sekiller(); hata verir. sekiller sinifi abstract oldugu için nesne olusumuna ızın vermez
    Sekiller sekil1=new Cember();
    sekil1.setRenk("sari");
    sekil1.x_koor=10;
    sekil1.y_koor=10;
    // sekil1.yaricap; ulasılamaz. cunku data tipi ve constructor farklı. degişken alırken data tipine bakılır. data tipinde degişken tanımlanmamıssa ust sınıftan data sınıfına aktarılıyorsa o degeri alır, aktarılmazsa degişkene ulasılamaz hata verir.(alt sınıfta tanımlansa bile kalıtım kuralı geregı ust sınıf alt sınıfa erişemez )
    sekil1.Ciz();
    sekil1.Zoom();
    sekil1.Sil();

    Dikdortgen sekil2=new Dikdortgen();
    sekil2.k_kenar=5;
    sekil2.u_kenar=10;
    sekil2.x_koor=4;
    sekil2.y_koor=6;
    sekil2.Ciz();
    sekil2.Sil();
    sekil2.Zoom();
    sekil2.setRenk("kirmizi");
    sekil2.info();
   }
}
