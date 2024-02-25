package Static;

public class MetotDegisken {
    public static int deger = 50;
    public int deger2 = 10;

    public static void staticMetotYaz() {
        System.out.println("Static Metot Yazildi");
        deger = 95;
        // deger2=80; hata verir static metot static olmayan değişkene ddogrudan erişim
        // sağlayamaz  nesne üretilmediği için değişken henüz başlatılmadı
    }

    public void staticOlmayanMetotYaz() {
        System.out.println("Static Metot Yazildi");
        deger = 84;
        deger2=45; // değer başlatılmadı ama static olmayan metota erişmek için nesne üretilmeli. nesne üretilince dolaylı olarak değişken başlatılmıs olur
    }
}

class Metot {
    int i = 5;
    static int k = 6;

    public static void main(String args[]) {
        Metot a1=new Metot();
        a1.m1();
        System.out.println(a1.m2(2,9));

        // int j=i; i değişkeni static değil nesne oluşturulmadıgı ıcın henuz baslatılmamıs
        // m1(); i metotu static değil nesne oluşturulmadıgı ıcın henuz baslatılmamıs
    }

    public void m1() {
        i = i + k + m2(i, k);  // m2 metodu static oldugu için nesne olusturulmadan da erişim sağlanabilir
        // i  değişkeni static değil ama hata vermez bunun sebebi nesne uretilince dolaylı olarak i değişkeni başlatılmıs olur
    }

    public static int m2(int i, int j) {
        return (int) Math.pow(i, j);
    }
}