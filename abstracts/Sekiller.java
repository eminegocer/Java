package abstracts;
public abstract class Sekiller {
    Sekiller(){
        
    }

    void info(){
        System.out.println("seklin rengi:" + getRenk());
        System.out.println("seklin x koordinati::" + x_koor);
        System.out.println("seklin y koordinati::" + y_koor);
    }
    private String renk;
    public int x_koor;
    public int y_koor;

    public abstract void Ciz();
    public abstract void Sil();
    public abstract void Zoom();

    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
       }

}

