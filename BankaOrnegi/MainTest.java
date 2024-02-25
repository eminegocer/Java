package BankaOrnegi;

public class MainTest {
    public static void main(String args[]){
        Banka m1=new Banka("1213456", "Emine");
        m1.paraYatir(10000);
        m1.goster();
        m1.paraCek(4567);
    }
}
