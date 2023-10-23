public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // not return type constructor below (normally created for us)
    public BankAccount(){ // default constructor no rtn type & same class name
        // below is contructor chaining where default values are given calling overloaded constructor
        // 'this()' MUST be first line.
        this(456789, 250.00, "Dave Smith", "you@two.com", 789034567);
        System.out.println("Empty constructor called.");
    }

    // overloading default constructor with parameters. This approach guarantees the values
    // will be initialised when the object is created and is preferred over setters.
    // Constructors should only call other constructors; no methods of any kind
    public BankAccount(int accountNumber, double accountBalance, String customerName,
                       String customerEmail, int customerPhone) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        customerEmail = email; // name does not have to be identical but is custom
        customerPhone = phoneNumber; // when identical this. must be used.
    }

    // IntelliJ shortcut (Generate menu)
    public BankAccount(String customerName, String email, int phoneNumber) {
        // common to create one constructor fully implemented and then call this with
        // different argument numbers or null values
        this(9999999, 123.98, customerName, email, phoneNumber);
        System.out.println("Reduce params constructor called");

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



}
