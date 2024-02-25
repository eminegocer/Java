package Interface2;

public interface IEKitapOlustur {
    public static final String EKitapKalitesi=".pdf";
    //static final String BaskiBoyutu2="A4";
    //final String BaskiBoyutu3="A4";
    //String BaskiBoyutu4="A4";
    
    public void EKitapOlustur();
    default void EKitapOlustur2(){
        System.out.println("E-Kitap olusturuldu");
    }
}
