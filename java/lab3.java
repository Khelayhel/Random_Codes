import java.util.Scanner;
public class lab3 {
    public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 int x ;
 int y ;
 System.out.print("Enter first number: ");
 x = input.nextInt();
 System.out.print("Enter second number: ");
 y =input.nextInt();
 int z =(x < y) ? x : y;
 while(true){
     if(y%z==0 && x%z==0);
     System.out.printf("%nThe GCD of %d and %d is: %d",x,y,z);
     break;



 }
 
    }
}
