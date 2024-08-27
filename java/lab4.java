import java.util.Scanner;
public class lab4 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int amount = 5000,x;
    int y = 0;
    System.out.print("Enter amount to withdrawl: ");
    x = input.nextInt();
         if ( x < 5000 && x % 50 ==0){
          {
            amount -=x;}
            if(x >= 500)
            {
             System.out.printf("-500 * %d",x/500);   
             y+=x/500;
             x = x%500;
            }
            if(x>=100)
            {
             System.out.printf("%n-100 * %d",x/100);   
             y+=x/100;
             x = x%100;
            }
            if(x >= 50)
            {
             System.out.printf("%n-50 * %d",x/50);   
             y+=x/50;
            
            }
        
              System.out.printf("%nYou got %d banknotes.",y);
    
         System.out.printf("%nThe remaining amount: %d",5000-x);
    
        }else {
         System.out.print("%nYou must enter an amount multiple of 50 and less than 5000.");
        }
  
    }

}
