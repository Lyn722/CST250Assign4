
package assign4;

public class checkingaccount  extends bankaccount{
    private int transactioncount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE  = 2.0;
    
    
    public checkingaccount( int initialbalance){
        super(initialbalance);
        transactioncount = 0;
    }
    
    public void deposit(double amount ){
        transactioncount++;
        super.deposit(amount);
        
        
    }
    
       public void withdraw(double amount ){
        transactioncount++;
        super.withdraw(amount);
       }
    
       public void deductfees(){
           if (transactioncount > FREE_TRANSACTIONS) {
               double fees  = TRANSACTION_FEE  * (transactioncount - FREE_TRANSACTIONS);
               super.withdraw(fees);
           }
           transactioncount = 0;
           
           
       }
       
       
}