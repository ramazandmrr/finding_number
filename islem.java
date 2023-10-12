public class islem{

    
    int sonuc;
    public int islemmm(int sayi1,int sayi2,int islem){
        switch(islem){
        case 1 : 
            sonuc = sayi1+ sayi2; 
        break;
        case 2 :if(sayi1>sayi2){
               sonuc = sayi1- sayi2; 
            }else{
                sonuc =sayi2-sayi1;
            
            }
             
        break;
        case 3 :             
            sonuc = sayi1 * sayi2; 
        break;
        case 4 : if(sayi2 == 0){
            sonuc = sayi2/sayi1;
        }else{
            sonuc = sayi1 / sayi2; 
        }
            
        break;
        default : System.out.println("hata");
        break;



        }
        
        
        return sonuc;
    }
           
    
    


    
}