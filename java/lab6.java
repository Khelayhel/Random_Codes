import java.util.Scanner;
public class lab6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x = 70;
        int y=0;
        int n;
       
        while(true){
            System.out.print("Enter your guess(0-1000 or -1 to exit): ");
             n = input.nextInt();
            if(n==-1){
            System.out.println("Goodbye");    
            break;    
            } 
            if(n<=0 || n>=1000){
            System.out.println("Wrong number Goodbye");    
            break;    
            }
            if(n==70){
            System.out.printf("Congratulations!!.....you win after %d guesses",y+1);
            break;}
            else if(n<x){
            System.out.println("It is too low");
            }
            else if(n>x){
            System.out.println("It is too high");
            }
        
         y++;  
    }
     
     
     


    }
}
