import java.util.Currency;

public class VL20_Student extends VL20_Person{

    private final int studentNumber;

    public VL20_Student(String name, String mailAddress, int studentNumber) {
        super(name, mailAddress);
        this.studentNumber = studentNumber;
        System.out.println("Konstruktor Student(String, String, int)");

    }

    public VL20_Student(String name, String mailAddress) {
        this(name, mailAddress, -1);
        System.out.println("Konstruktor Student(String, String)");
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + studentNumber;
    }
}

