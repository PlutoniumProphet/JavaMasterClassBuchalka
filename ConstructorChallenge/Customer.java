public class Customer {

    private String name;
    private int creditLimit;
    private String email;

    public Customer(){ // sets defaults for name & email
        this("Joe Bloggs", "info@me.com");
    }

    public Customer(String name, String email) {
        this(name, 5000, email); // set default for credit limit
    }

    // chaining both constructors above
    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName(){ return name; }
    public int getCreditLimit(){ return creditLimit; }
    public String getEmail(){ return email; }
}