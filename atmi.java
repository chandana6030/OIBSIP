import java.util.Scanner;  
  
public class atmi 
{  
    public static void main(String args[] )  
    {  
        int balance =100000, withdraw, deposit;  
          
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM");  
            System.out.println("Withdraw = click 1");  
            System.out.println("Deposit = click 2");  
            System.out.println("Check Balance = click 3");  
            System.out.println("EXIT = click 4");  
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        withdraw = sc.nextInt();  
                      
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("****Thank You!..Please collect your money****");  
        }  
        else  
        {  
            System.out.println("****Sorry!..Insufficient Balance****");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        deposit = sc.nextInt();  
                      
        balance = balance + deposit;  
        System.out.println("****Congrats!..Your Money has been successfully deposited****");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  