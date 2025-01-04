public class VL20_Person {

    private final String name;
    private final String mailAddress;

    public VL20_Person(String name, String mailAddress) {
        this.name = name;
        this.mailAddress = mailAddress;
    }
    
    public String getName() {
        return this.name;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    @Override
    public String toString() {
        return name + ", " + mailAddress;
    }
}
