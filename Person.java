public class Person implements Comparable<Person> {

    private final String name;
    private final String mailAddress;
    
    public Person(String name, String mailAddress) {
        this.name = name;
        this.mailAddress = mailAddress;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMailAddress() {
        return mailAddress;
    }
    
    @Override
    public int hashCode() {
//         int hash = 0;
//         for(char character: name.toCharArray()) {
//             hash += character;
//         }
//         return hash;
        // Wir nehmen die fertige Hash-Funktion der String-Klasse, da unsere einfache Hashfunktion tatsächlich ziemlich schlecht ist. (s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1])
        // Quelle: https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/lang/StringLatin1.java
        int hash = 0;
        for(char character: name.toCharArray()) {
            hash = 31 * hash + (character & 0xff);
        }
        return hash;
// alternativ könnten wir auch folgende Zeile schreiben, aber so habt ihr mal die Implementierung einer guten Hashfunktion gesehen (wo verrückter Kram mit den einzelnen Bits gemacht wird):
//         return name.hashCode();
    }
    
    @Override
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(other == null || getClass() != other.getClass())
            return false;
        return ((Person) other).name.equals(this.name) && ((Person) other).mailAddress.equals(this.mailAddress);
    }
    
    @Override
    public String toString() {
        return name + ", " + mailAddress;
    }
    
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

} 
