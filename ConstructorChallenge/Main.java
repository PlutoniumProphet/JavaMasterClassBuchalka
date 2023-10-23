import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Full Con", 7500, "one@test.com");
        System.out.println(customer.getName());

        Customer secCustomer = new Customer();
        System.out.println(secCustomer.getEmail());

        Customer thirdCustomer = new Customer("Third Con", "three@test.com");
        System.out.println(thirdCustomer.getCreditLimit());



    }
}
