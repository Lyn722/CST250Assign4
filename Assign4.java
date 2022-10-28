
package assign4;

public class Assign4 {

    public static void main(String[] args) {
       // sams account 
      //   System.out.println("-----------------SAMS BANK ACCOUNT------------------");
      //  bankaccount sambankaccount = new bankaccount(200);
       // System.out.println("Initially, sams bank account has:  $" + sambankaccount.getbalance());
        
      
      //  sambankaccount.deposit(100);
       // System.out.println("After the inital money in Sams bank account, now she has: $" +
           //     sambankaccount.getbalance());
        
       // sambankaccount.withdraw(10);
       // System.out.println("after the first withdrawl, Sam's account has : $" + 
             //   sambankaccount.getbalance());
        
      //  System.out.println("---------------------------------------------------");
        
      //  System.out.println();
       //  System.out.println();
         // creating an account for emily 
          System.out.println("--------------EMILYS CHECKING ACCOUNT------------------");
          bankaccount emilycheckingaccount = new checkingaccount(200);
        System.out.println("Initially, sams bank account has:  $" + emilycheckingaccount.getbalance());
          
        //emilycheckingaccount.withdraw(50);
        
        //System.out.println("after the first withdrawl, Emily's account has : $" + 
              //  emilycheckingaccount.getbalance());
        
          emilycheckingaccount.deposit(50);
        System.out.println("After the inital money in Emily's bank account, now she has: $" +
                emilycheckingaccount.getbalance());
        
        
         
        
          System.out.println("---------------------------------------------------");
        
        System.out.println();
         System.out.println();
         
           System.out.println("--------------JOE'S SAVINGS ACCOUNT------------------");
         
         savingsaccount joesavingsaccount = new savingsaccount(.05);
         System.out.println("initially, Joe's savings account has : $" +
                 joesavingsaccount.getbalance());
         
         joesavingsaccount.deposit(100);
         
         System.out.println("After the first deposit, Joe's savings account has: $" + joesavingsaccount.getbalance());
         
         
         joesavingsaccount.withdraw(50);
        
        System.out.println("After the first withdrawl, Joe's account has : $" + 
               joesavingsaccount.getbalance());
         
         
         
         //joesavingsaccount.transfer(emilycheckingaccount, 50);
         //  System.out.println("After the second transfer, Emily's savings account has: $" + emilycheckingaccount.getbalance());
         
          emilycheckingaccount.transfer(joesavingsaccount, 100);
         System.out.println("After the first transfer, Emily's savings account has: $" + emilycheckingaccount.getbalance());
         
         System.out.println("After the first transfer, Joe's savings account now has: $" + joesavingsaccount.getbalance());
         
         joesavingsaccount.addinterest();
         System.out.println("After the end of the month transactions Joe's savings account has: $"  + joesavingsaccount.getbalance());
         
         joesavingsaccount.withdraw(500);
        
        System.out.println("After the first withdrawl, Joe's account has : $" + 
              joesavingsaccount.getbalance());
        
           System.out.println("---------------------------------------------------");
        
        System.out.println();
         System.out.println();
         
          System.out.println("-----------------SAMS SAVING ACCOUNT------------------");
        savingsaccount samsavingsaccount = new savingsaccount(250);
        System.out.println("Initially, sams bank account has:  $" + samsavingsaccount.getbalance());
         
         
         
          samsavingsaccount.addinterest();
         System.out.println("After the end of the month transactions Joe's savings account has: $"  + samsavingsaccount.getbalance());
         
         
         
         
         
         
         
            System.out.println("---------------------------------------------------");
        
        System.out.println();
         System.out.println();
         
         
         
        // emilycheckingaccount.deductfees();
           //System.out.println("After the end of the month transactions Emily's checking account has: $" + emilycheckingaccount.getbalance());
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
    
}
