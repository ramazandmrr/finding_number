
public class sec{
    
    public int Sec(int s1,int s2,int s3,int s4,int s5,int s6,int rasgelesecim){
    int secim1 = 0;
    switch(rasgelesecim){
     case 1 : secim1 = s1;                
         break;
     case 2 : secim1 = s2;
         break;
     case 3 : secim1 = s3;
         break;
     case 4 : secim1 = s4;        
         break;
     case 5 : secim1 = s5;
         break;
     case 6 : secim1 = s6*10;
         break;
     default : System.out.println("hata...");
         break;                   
 
    } 
    return secim1;
   }
}   
    
    



