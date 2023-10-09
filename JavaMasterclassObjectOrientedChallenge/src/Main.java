public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        myAccount.depositFunds(100.00);
        myAccount.depositFunds(50.00);
        myAccount.withdrawFunds(125.00);
        myAccount.withdrawFunds(150.00);

    }

}
