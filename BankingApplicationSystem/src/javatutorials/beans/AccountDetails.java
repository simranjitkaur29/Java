package javatutorials.beans;

public class AccountDetails {

    private  int accountNo;
    private double amount;

    public AccountDetails(int accountNo, double amount) {
        this.accountNo = accountNo;
        this.amount = amount;
    }

    public int getAccountNo() {
        return accountNo;
    }



    public double getAmount() {
        return amount;
    }

    public  void setAmount(double amount)
    {
        this.amount=amount;
    }
    public String toString()
    {
        return "Your Account Details is  "+accountNo + " ,amount: "+amount +"]";
    }


}
