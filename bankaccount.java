
package assign4;

public class bankaccount{
    
    private double balance;
    
    public bankaccount(){
        balance = 0;
    }
    
    public bankaccount(double initialbalance) {
        balance = initialbalance; 
    }
    
    public void deposit (double amount) {
      //  balance  = balance + amount;
        
        balance += amount;
        
        
    }
    
    public void withdraw(double amount){
       // balance = balance - amount;
        balance -= amount;
        
    }
    
    public double getbalance(){
        return balance;
    }
    
    public void transfer(bankaccount other, double amount){
        withdraw(amount);
        other.deposit(amount);
    }
}
