public class VL22_PersonTest {
    
    public static void main(String[] args) {
        
        try {
            VL20_Employee micahel = new VL20_Employee("Schoettner", "schoettner@hhu.de", -1234);


            System.out.println(micahel);
            System.out.println(micahel.getSalary());
            System.out.println(micahel.getName());
        }catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
