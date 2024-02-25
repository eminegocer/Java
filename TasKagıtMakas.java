import java.util.Scanner;

public class TasKagıtMakas {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int pcSecım=(int)(Math.random()*3+1);
        System.out.println("taş(1), kağıt(2), makas(3)  birini seçınız");
        int senSecım=input.nextInt();
       /*  1=taş
           2=kağıt
           3=makas
           */
        
         int pc=0;
         int sen=0;
        
         /*for(;;){
         if(pcSecım==senSecım){
            System.out.println("pc secımı: " + pcSecım);
            System.out.println("pc:" + pc + " sen:" + sen);
            System.out.println("berabere tekrar secım yapınız"); 
         }


         else if(pcSecım==1){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==2){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==3){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
             else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
         }
        
        
         else if(pcSecım==2){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==1){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==3){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
            else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
         }

            
         else if(pcSecım==3){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==1){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==2){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
            else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
         }



         System.out.println("oyuna devam etmek için tekrar seçim yapınız");
         senSecım=input.nextInt();
         pcSecım=(int)(Math.random()*3+1);
        
      }*/

        while(true){
        
         
         if(pcSecım==senSecım){
            System.out.println("pc secımı: " + pcSecım);
            System.out.println("pc:" + pc + " sen:" + sen);
            System.out.println("berabere tekrar secım yapınız"); 
         }


         else if(pcSecım==1){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==2){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==3){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
             else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
            if(pc==3 || sen==3){
            System.out.println("Oyun bitti");
              break;}
         }
        
        
         else if(pcSecım==2){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==1){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==3){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
            else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
            if(pc==3 || sen==3){
            System.out.println("Oyun bitti");
              break;}
         }

            
         else if(pcSecım==3){
            System.out.println("pc secımı: " + pcSecım);
            if(senSecım==1){
               sen=sen+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            }
            else if(senSecım==2){
               pc=pc+1;
               System.out.println("pc:" + pc + " sen:" + sen);
            } 
            else{
               System.out.println("hatalı seçim lütfen tekrar deneyiniz");
            }
            if(pc==3 || sen==3){
            System.out.println("Oyun bitti");
              break;}
         }



         System.out.println("oyuna devam etmek için tekrar seçim yapınız");
         System.out.println("-------------------------------");
         senSecım=input.nextInt();
         pcSecım=(int)(Math.random()*3+1);
         
        }
   }
}