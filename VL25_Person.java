public class VL25_Person {
    private String lastname;

    public VL25_Person(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for(char character: lastname.toCharArray()) {
            hash += character - 'A';
        }
        return hash;
        //return this.lastname.charAt(0) - 'A';
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        return this.lastname.equals( ((VL25_Person)other).lastname);
    }

    @Override
    public String toString() {
        return lastname;
    }
}
