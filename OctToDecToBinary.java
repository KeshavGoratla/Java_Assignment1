import java.lang.Math;
import java.util.Scanner;
class OctToDecToBinary {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int oct,dec,bin;
    System.out.println("Enter octal Number : ");
    oct = s.nextInt();
    
    dec = octToDec(oct);
    bin =  DecToBin(dec); 
System.out.println("Decimal Number of "+ oct + " : "+ dec);  
 System.out.println(" Binary Number of "+ dec + " : "+ bin);     
    }
    public static int octToDec(int num){
     int rem,res = 0,i = 0;
        
           while(num!=0)
            {
                rem = num % 10;
                res += (Math.pow(8,i)*rem);
                num = num / 10;
                i++;
              
            }
         return res;
}

 public static int DecToBin(int num){
   
          int rem,res = 0,i = 0;
         
           while(num!=0 )
            {
                rem = num % 2;
                res += (Math.pow(10,i)*rem);
                num = num / 2;
                i++;
               
            }
        return res;
     }
}
