import java.util.Scanner;
public class tutorial {
    public static void main(String[] args){
        int n,p,result=1;
        System.out.print("Enter number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.print("Enter power: ");
        p = r.nextInt();
        for(int i=1;i<=p;i++){
            result = n*result;
        }
        System.out.print("Power: " + result);

    }
}
