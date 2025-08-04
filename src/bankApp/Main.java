
package bankApp;

import java.util.Scanner;
import Bangking.bangkingClass;
/**
 *s
 * @author SCC-COLLEGE
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int attemp = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? \n");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = inp.nextInt();
        
        switch(choice){
            case 1:
                while(attemp != 0){
                    bangkingClass bank= new bangkingClass();
                    
                    System.out.print("Enter your Account No: ");
                    int accountNo = inp.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = inp.nextInt();

                    if(bank.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        break;
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                        attemp --;
                         System.out.println("\nAttemp left: "+attemp);
                    }
                }
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
    }
    
}
