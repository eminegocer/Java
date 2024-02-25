package Abstracts;

public class TestOgrenci {
    public static void main(String args[]){
        Ogrenci ogr1=new Ogrenci(220541019,"Emine", 1250);
        Ogrenci ogr2=new Ogrenci(220501145, "Sema", 4560, "Mat");
        ogr1.bilgileriGoster();
        System.out.println("-----------------------------");
        ogr2.bilgileriGoster();
    }
}
