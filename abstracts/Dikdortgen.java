package abstracts;
public class Dikdortgen extends Sekiller {
    public int k_kenar, u_kenar;
    Dikdortgen(){
       
    }
    void info(){
        System.out.println("dikdortgenin rengi:" + getRenk());
        System.out.println("dikdortgenin kisa kenari:" +k_kenar);
        System.out.println("dikdortgenin uzun kenari:" + u_kenar);
        System.out.println("dikdortgenin x koordinati::" + x_koor);
        System.out.println("dikdortgenin y koordinati::" + y_koor);
    }
    public void Ciz(){
        System.out.println("-------------------------");
        System.out.println("Dikdortgen cizdiriliyor...");
        System.out.println("Dikdortgen cizdirildi.");
    }
    public void Sil(){
        System.out.println("----------------------------");
        System.out.println("Dikdortgen silme işlemi gerceklestiriliyor...");
        System.out.println("Dikdortgen silme işlemi gerceklestirildi.");
    }
    public void Zoom(){
        System.out.println("------------------------------");
        System.out.println("Dikdortgen yakınlastırılma işlemi gerceklestiriliyor...");
        System.out.println("Dikdortgen yakinlastirilma işlemi gerceklestirildi.");
    }
}
