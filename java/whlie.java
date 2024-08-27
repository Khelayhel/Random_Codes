import java.util.Scanner;
public class whlie {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int f=1;
        int n;
        System.out.print("Enter number: ");
        n = input.nextInt();
        while(n >= 1){
        f=f*n;  
        n--;  
    }
     System.out.println(f);
     


 

    }
}
