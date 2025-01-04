import java.util.Currency;

public class VL20_Employee extends VL20_Person {
    
    private final double salary;
    private static final String CURRENCY = "EUR";

    public VL20_Employee (String name, String mailAddress, double salary) {
        super(name, mailAddress);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + salary + CURRENCY;
    }
}

