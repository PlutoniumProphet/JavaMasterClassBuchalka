public class Main {

    public static void main(String[] args) {

//        BankAccount myAccount = new BankAccount();
        BankAccount myAccount = new BankAccount(12345, 100000,
                "Titus Vegator", "me@me.com", 987654321);

        BankAccount bobsAccount = new BankAccount();
        BankAccount susanAccount = new BankAccount("Susan Smith", "sue@me.com",
                789789789);

//        myAccount.setAccountNumber(12335646);
//        myAccount.setAccountBalance(1000);
//        myAccount.setCustomerName("Bob Brown");
//        myAccount.setEmail("me@code.com");
//        myAccount.setPhoneNumber(1234567890);

        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getAccountBalance());

        myAccount.depositFunds(100.00);
        myAccount.depositFunds(50.00);
        myAccount.withdrawFunds(125.00);
        myAccount.withdrawFunds(150.00);

        System.out.println(bobsAccount.getCustomerName());
        System.out.println(susanAccount.getAccountNumber());
        System.out.println(susanAccount.getCustomerName());

    }

}
