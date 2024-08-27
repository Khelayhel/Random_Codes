
import java.security.SecureRandom;
import java.util.Scanner;
public class learning {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    SecureRandom random = new SecureRandom();
    int x;
    int y;
    int z;
    int a;
    System.out.print("Enter lowest value: ");
    x = input.nextInt();
    System.out.print("Enter highest value: ");
    y = input.nextInt();
    System.out.print("Diff. between values: ");
    z = input.nextInt();
    System.out.print("Number of random numbers: ");
    a = input.nextInt();
    for(int i = 0; i < y;i++){
     int roll =  x + z * random.nextInt(a);


      System.out.printf("%d," ,roll );}
    

    }


    }
    
