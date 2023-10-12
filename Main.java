import java.util.Random;

public class Main {

public static void main(String[] args) {
   
   Random rasgele = new Random();
   int rasgeleSayi1 = rasgele.nextInt(9)+1;   
   int rasgeleSayi2 = rasgele.nextInt(9)+1;
   int rasgeleSayi3 = rasgele.nextInt(9)+1;   
   int rasgeleSayi4 = rasgele.nextInt(9)+1;   
   int rasgeleSayi5 = rasgele.nextInt(9)+1;      
   int rasgeleSayi6 = rasgele.nextInt(9)+1;   
   int rasgeleSayi7 = rasgele.nextInt(900)+100;   
   sec Sec = new sec();
   islem İslem = new islem();
   System.out.println("sayilar : "+ rasgeleSayi1 + " "+rasgeleSayi2 +" "+ rasgeleSayi3+ " "+ rasgeleSayi4+ " "+rasgeleSayi5 + " "+ rasgeleSayi6*10+ " "+ rasgeleSayi7 );
int a,b,c,d,e;
   do{
    
    int secmeislemi2,secmeislemi3,secmeislemi4,secmeislemi5,secmeislemi6;
    int rasgelebirsayi = rasgele.nextInt(6)+1;
    int secmeislemi1 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi);
    
    
    do{
        int rasgelebirsayi2 = rasgele.nextInt(6)+1;
        secmeislemi2 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi2);
        
    }while(secmeislemi2  == secmeislemi1);
    do{
        int rasgelebirsayi3 = rasgele.nextInt(6)+1;
        secmeislemi3 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi3);
        
    }while(secmeislemi3 ==  secmeislemi2 ||  secmeislemi3 == secmeislemi1);
    do{
        int rasgelebirsayi4 = rasgele.nextInt(6)+1;
        secmeislemi4 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi4);
        
    }while(secmeislemi4  == secmeislemi3 ||   secmeislemi4 == secmeislemi2 || secmeislemi4 == secmeislemi1);
    do{
        int rasgelebirsayi5 = rasgele.nextInt(6)+1;
        secmeislemi5 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi5);
        
    }while(secmeislemi5  == secmeislemi4 ||  secmeislemi5 == secmeislemi3 ||  secmeislemi5== secmeislemi2 || secmeislemi5 == secmeislemi1);
    do{
        int rasgelebirsayi6 = rasgele.nextInt(6)+1;
        secmeislemi6 = Sec.Sec(rasgeleSayi1, rasgeleSayi2, rasgeleSayi3, rasgeleSayi4, rasgeleSayi5, rasgeleSayi6,rasgelebirsayi6);
        
    }while(secmeislemi6 == secmeislemi5 ||  secmeislemi6 == secmeislemi4 || secmeislemi6 == secmeislemi3 ||  secmeislemi6 == secmeislemi2 ||  secmeislemi6 == secmeislemi1);
         
    System.out.println("1 = toplama , 2 = cikarma , 3 = carpma ,4 = bölme");
    int rasgeleislem = rasgele.nextInt(4)+1;
    a = İslem.islemmm(secmeislemi1, secmeislemi2, rasgeleislem);
    int rasgeleislem2 = rasgele.nextInt(4)+1;
    b = İslem.islemmm(secmeislemi3, a, rasgeleislem2);
    int rasgeleislem3 = rasgele.nextInt(4)+1;
    c = İslem.islemmm(secmeislemi4, b, rasgeleislem3);
    int rasgeleislem4 = rasgele.nextInt(4)+1;
    d = İslem.islemmm(secmeislemi5, c, rasgeleislem4);
    int rasgeleislem5 = rasgele.nextInt(4)+1;
    e = İslem.islemmm(secmeislemi6, d, rasgeleislem5);
    
    System.out.println("-----Yaptigi islemler-----");
    System.out.println("iki sayi arasinda rakam  1 : toplama  / 2: cikarma / 3 : carpma / 4 : bölme");
    
        
    System.out.println(secmeislemi1+ " "+rasgeleislem+ " "+ secmeislemi2 + " "+ rasgeleislem2 + " "+ secmeislemi3 + " " + rasgeleislem3 + " "+ secmeislemi4 + " "+ rasgeleislem4+" "+ secmeislemi5+ " "+rasgeleislem5+ " "+ secmeislemi6 +" = "+e);
    
}while(e+9<rasgeleSayi7 || e-9 >rasgeleSayi7);
    

   System.out.println("islem bitmistir");
   System.out.println("sayimiz : "+rasgeleSayi7);
   System.out.println("NOT : eger iki 2. sayi 0 ise 1. ve 2 . yer degisiyor  !.! ve 2.sayi 1 . sayindan bücük  ise sayilar yer degisiyor !!!! ");
  }  
}









