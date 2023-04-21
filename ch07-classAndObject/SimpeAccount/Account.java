public class Account{
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    private String accountNumber;
    private String owner;
    private long balnace;


    public long deposit(long money){
        balnace =+ money;
        return balnace;
    }
    public long withdraw(long money){
        if (balnace >= money){
            balnace =- money;    
        } 
        return balnace;
        
    }

}