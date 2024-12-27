public class VL3_LeapYear {
    public static void main (String []args){
        // ein Jahr ist ein Schaltjahr, wenn
        // 1. die Jahreszahl durch 4 teilbar
        //      2. außer, die Zahl ist durch 100 teilbar
        //          3. außer, die Zahl ist auch 400 teilbar

        int year = Integer.parseInt(args[0]);

        boolean rule1 = year % 4 == 0;
        boolean rule2 = year % 100 == 0;
        boolean rule3 = year % 400 == 0;

        boolean isLeapYear = (rule1 && !rule2) || rule3;



        
    /*  if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }    */



        if (isLeapYear) {

            System.out.println(year + " ist ein Schaltjahr");
        }else {
            System.out.println(year + " ist kein Schaltjahr");
        }
    }
}
