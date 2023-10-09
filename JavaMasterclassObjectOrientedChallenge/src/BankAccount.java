public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){

        accountBalance += depositAmount;
        System.out.println("You have deposited " + depositAmount + ". You new balance is " +
                accountBalance + ".");
    }

    public void withdrawFunds(double withdrawalAmount){

        if (withdrawalAmount > accountBalance) {
            System.out.println("Declined withdrawal: " + withdrawalAmount +
                    ". You have insufficient funds: " + accountBalance);
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdraw " + withdrawalAmount + ". Your new balance is " +
                    (accountBalance) + ".");
        }
    }

}
