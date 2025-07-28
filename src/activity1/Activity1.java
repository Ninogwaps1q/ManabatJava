
package activity1;

import java.util.Scanner;

public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        float total = 0;
        float ave = 0;
        
        System.out.print("Enter Student name: ");
        String name = inp.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int numSub = inp.nextInt();
        
        for(int x = 1; x <= numSub; x++){
            
            System.out.print("Enter grade for subject " +x);
            float grade = inp.nextFloat();
            
            total += grade;
            ave = total / numSub;
        }
        
        System.out.println("Average: " +ave);
        
        if(ave <= 100 && ave >= 75){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
    
}
