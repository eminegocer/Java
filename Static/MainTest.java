package Static;

public class MainTest {
    public static void main(String args []){
        MetotDegisken.staticMetotYaz(); // MetotDegisken sınıfından nesne uretilmemesine rağmen bu sınıftakı static metoda erişim saglanabilir
        // MetotDegisken.staticOlmayanMetotYaz(); metot static olmadıgı için erişim sağlanmaz
        // MetotDegisken.deger;  değişkenler static olsa da olmasa da  nesne uretilmeden erişim sağlanamaz
        MetotDegisken nesne1= new MetotDegisken();
        System.out.println(nesne1.deger2);
        System.out.println(MetotDegisken.deger);
    }
}
