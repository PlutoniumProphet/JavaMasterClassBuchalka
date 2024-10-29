package InheritanceChallengeWorkerEmployees;

import java.util.stream.StreamSupport;

public class main {
    public static void main(String[] args) {

        SalariedEmployee salaryJoe = new SalariedEmployee(
                "Joe", "14/01/1975", "N/A", 96000.00, false);
        salaryJoe.employeeID = 999100001;
        salaryJoe.hireDate = "01/01/2000";
        salaryJoe.annualSalary = 96000.00;

        System.out.println("Joe age is: " + salaryJoe.getAge());
        System.out.println("Joe earns £" + salaryJoe.collectPay() + " per month.");
        System.out.println("Is Joe retired? " + salaryJoe.isRetired);
        System.out.println("Here is Joe's pay: " + salaryJoe.collectPay());

        HourlyEmployee hourlyJane = new HourlyEmployee(
                "Jane", "12/10/1974", "N/A", 10.55);
        hourlyJane.employeeID = 999100002;
        hourlyJane.hireDate = "01/03/1995";

        System.out.println("Jane age is: " + hourlyJane.getAge());
        System.out.println("Jane earns £" + hourlyJane.collectPay() + " per week!");
        System.out.println("Jane get paid overtime at: " + hourlyJane.getDoublePay());
        System.out.println("Jane is naughty. ");
        hourlyJane.terminate("28/10/24");
        }
}

class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
       this.name = name;
       this.birthDate = birthDate;
       this.endDate = endDate;
    }

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 1000.00; // TODO
    }

    public void terminate(String endDate) {
        System.out.println("Termination date: " + endDate);
    }

}

class Employee extends Worker {

    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }
    public long employeeID;
    public String hireDate;

}

class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, String birthDate, String endDate,
                            double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    protected double annualSalary;
    public boolean isRetired;

    @Override
    public double collectPay() {
        return annualSalary / 12;
    }

    private void retire(long employeeId, boolean isRetired) {
        if (isRetired == false) {
            System.out.println("Employee is already retired...");
           } else {
            isRetired = true;
            System.out.println("Employee is now retired");
        }
    }
}

class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, String birthDate, String endDate,
                          double hourlyPayRate) {
        super(name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    protected double hourlyPayRate;

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    protected double getDoublePay() {
        return hourlyPayRate * 2;
    }
}