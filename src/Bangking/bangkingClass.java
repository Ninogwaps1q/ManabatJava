
package Bangking;
/**
 *
 * @author SCC-COLLEGE
 */
public class bangkingClass {
    int accountNo = 1234;
    String name;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
        
        if(acc == accountNo && pn == pin){
            return true;
        }else{
            return false;
        }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
}
