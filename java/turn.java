import java.util.Scanner;
public class turn {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        float x = input.nextFloat();
        System.out.print("Enter Second number: ");
        float y = input.nextFloat();
        System.out.print("Enter Third number: ");
        float z = input.nextFloat();
        float result;
        result =  mini(x,y,z);
        System.out.println("The minimum number is: "+result);    
    }
   public static float mini(float x,float y,float z){
    float minval = x;
    if(y < minval)
    minval=y;
    if(z < minval)
    minval=z;
    return minval;


   }
}

