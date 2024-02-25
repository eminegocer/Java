package kitaplar;
public class Kitaplar {
        public String adi;
        private double kdv=0.15;
        private String yazari;
        private int basim_yili;
        protected int sayfa_sayisi;
        String isbn;
        private double fiyat=100;
        public double getFiyat() {
            return fiyat;
        }
        public void setFiyat(double fiyat) {
            this.fiyat = fiyat;
        }
    
        Kitaplar(){
    
        }
        Kitaplar(String adi, String isbn){
            this.adi=adi;   
            this.isbn=isbn;     
        }

        
         double fiyatHesapla(){
            return fiyat+=fiyat*getKdv();
         }

         void fiyatArtisUygula(){
            fiyat=getFiyat()+getFiyat()*0.1;
            System.out.println("kitabin son fiyati:" + fiyat);
          }
     
          void fiyatIndirimUygula(){
             fiyat=getFiyat()-getFiyat()*0.1;
            System.out.println("kitabin son fiyati:" + fiyat);
          }
         public void bilgiYaz(){
            System.out.println("-----------------------------------------------");
            System.out.println("kitabin adi:" + adi);
            System.out.println("kitabin yazari:" + getYazari());
            System.out.println("kitabin basim yili:" + getBasim_yili());
            System.out.println("kitabin sayfa sayisi:" + sayfa_sayisi);
            System.out.println("kitabin normal fiyati:" + fiyat);
            System.out.println("kitabin KDV dahil fiyati:" + fiyatHesapla());

         }
         public double getKdv() {
             return kdv;
         }
         public void setKdv(double kdv) {
             this.kdv = kdv;
         }
         public String getYazari(){
            return yazari;
         }
         public void setYazari(String yazari){
            this.yazari=yazari;
         }
         public int getBasim_yili() {
             return basim_yili;
         }
         public void setBasim_yili(int basim_yili) {
             this.basim_yili = basim_yili;
         }


   

}
