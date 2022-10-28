
package assign4;

public class savingsaccount extends bankaccount {
    private double interestrate;
    
    public savingsaccount(double rate){
        interestrate = rate;
        
    }
    
    public void addinterest(){
        double interest = this.getbalance() * interestrate/100;
        this.deposit(interest);
    }
    
    
}
