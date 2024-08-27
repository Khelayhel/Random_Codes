/**
 * Name: Khalid Helayhel
 * Class: 173
 * Date: 14 Sept 2021
 * Project: Making a functional Atm machine
 */
import java.util.Scanner;//importing Scanner//
public class ATM {
    public static void main(String[] args){
     Scanner id = new Scanner(System.in);//using scanner to save the input//
     String name;//variable//
      Scanner Withdraw = new Scanner(System.in);//Scanner for Withdraw case// 
      Scanner Deposit = new Scanner(System.in);//Scanner for Deposit case//
      System.out.print("Enter your user name:");
      name = id.nextLine();//input for the user to put hid username//
      System.out.println("Welcome " + name);//Welcoming the user//
      System.out.println("1.Withdraw");//The options of the Atm//
      System.out.println("2.Deposit");
      System.out.println("3.Check Balance");
      Scanner input = new Scanner(System.in);//Scanner to pick option//
      System.out.print("Enter the number of the option you want: ");
      int option = input.nextInt();//input for option//
      switch(option){//Switch case for each option//
        case 1:
             System.out.print("Enter the amount you will Withdraw: ");
             int amount = Withdraw.nextInt();//input for scanner withdraw//
               if (amount < 1 || amount > 100 ){//If the amount is smaller than 1 and more than 100 it will type error//
               System.out.println("Error");}
                 if(amount >=1 && amount <= 100){//if the amount is between 0 and 100 it will proceed//
                  System.out.printf("The remaining amount in account: "+(100 - amount)); } 
                  break;  
        case 2:
             System.out.print("Enter the amount you want to deposit: ");//input amount to deposit//
             int number = Deposit.nextInt();
             System.out.printf("New balance: "+(100+number));//The new balance after depositing new amount//
             break;
        case 3:
             System.out.print("Your balance is 100 SR.");//Checking balance of account//
             break;
        default:
        System.out.println("You chose none of the options goodbye");//Choosing none of the options exits the program//
        break;



      
      


    
    
      }
    }
}
