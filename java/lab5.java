import java.util.Scanner;
public class lab5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int sum = 0;
        System.out.print("Enter number: ");
        a = input.nextInt();
        System.out.print("Enter number: ");
        b = input.nextInt();
        for(int i=a;i<=b;i++){
         if(i % 2 ==0){
         sum+=i;}
    }
     System.out.printf("The sum of numbers from %d to %d is %n%d",a,b,sum);
     





    }

}
