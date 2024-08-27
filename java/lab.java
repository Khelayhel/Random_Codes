import java.util.Scanner;
public class lab {
    private static int i;

    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int x;
      System.out.print("Enter number: ");
     x = input.nextInt();
     System.out.printf("The divisors of: %d%n",x);
     for(int c=1; c <= x;c++){
        if((x % c) == 0){
          System.out.printf("%d ",c); 
        }
    }
     
 }
}
