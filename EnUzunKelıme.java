import java.util.Scanner;

public class EnUzunKelıme {
  public static void main(String args []){
    Scanner input=new Scanner(System.in);

    String array[]=new String[5];

    for(int i=0; i<5; i++){
        System.out.println("dizinin " + i +". elemanı: ");
        String kelime=input.next();
        array[i]=kelime;

    }
     String max=array[0];
    for(int j=0; j<array.length; j++){
     if(array[j].length()>max.length()){
         max=array[j];
     }
    }System.out.println("en uzun kelime: " +max);

  }  
}
