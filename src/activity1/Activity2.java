
package activity1;

import java.util.Scanner;

/**
 *
 * @author SCC-COLLEGE
 */
public class Activity2 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        
        System.out.print("Enter employee name: ");
        String name = inp.nextLine();
        
        System.out.print("Enter hourly rate: ");
        int hourly = inp.nextInt();
        
        System.out.print("Enter total hours worked this week: ");
        float totalHours = inp.nextFloat();
        
        float Wage = hourly * totalHours;
        float SSS = Wage * 0.1f;
                
        System.out.println("\n----Wage Summary----");
        System.out.println("Enployee: " +name);
        System.out.println("Hourly: " +hourly);
        System.out.println("Hours Worked: " +totalHours);
        System.out.printf("Gross Weekly Wage: %.2f\n", Wage);
        System.out.printf("SSS Contribution(10%%): %.2f\n", SSS);
        System.out.println("------------------------------");
        System.out.printf("Net Weekly Wage: %.2f\n", Wage - SSS);
    }
}
