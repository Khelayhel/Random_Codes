/*Name: Khalid Ahmad Helayhel
Section: 173
Date: 10/14/2021
 */
import java.util.Scanner;//Importing Scanner//
public class Khalid_Helayhel_173 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Float Initial;//Identifying varaible as Float//
        Float New;
        System.out.print("Enter the Initial Mileage in Km: ");
        Initial= input.nextFloat();//Telling user to enter mileage to be saved//
        System.out.print("Enter the New Mileage in Km: ");
        New = input.nextFloat();
        Float Difference;//Identifying variable as Float//
        Difference = (New-Initial);//Calculating the new travel Distance by subtracting the two variables//
        System.out.printf("%nThe travelled distance is: %f Km",Difference);
        
              if(Difference <= 150){//Using if and else if statements to print the charges//
                  System.out.println("\nNo charges are applied.");
              }
              else if(Difference > 150 && Difference <= 500){
                  System.out.printf("%nThe applied charge amount is: %f Riyals.",Difference * 0.5);

              } 
              else if(Difference > 500 && Difference <= 1000 ){
                  System.out.printf("%nThe applied charge amount is: %f Riyals.",Difference * 0.75);
              }
              else{
              System.out.print("\nThe applied charge amount is: 1000 Riyals.");}



        

        




    }
    
}
