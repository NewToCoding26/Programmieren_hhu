import java.util.Scanner;

public class VL26_Benchmark {

    private static final int NUMBER_OF_PERSONS = 9;

    private static VL20_Person[] readPersons() {
        Scanner stdin = new Scanner(System.in);
        VL20_Person[] persons = new VL20_Person[NUMBER_OF_PERSONS];

        int i = 0;
        while (stdin.hasNext()) {
            String name = stdin.nextLine();
            String mail = "dummy@gmail.com";
            persons[i] = new VL20_Person(name, mail);
            i++;
        }
        System.out.println(i + " Personen eingelesen.");
        return persons;
    }
    public static void main(String[] args) {
        VL20_Person[] allPersons = readPersons();
        System.out.println(allPersons[2]);


        //Daten einfuegen
        VL17_List<Person> persons = new VL17_List<>();
        for(int i = 0; i < allPersons.length; i++) {
            persons.insert(allPersons[i]);
        }

        long start = System.currentTimeMillis();

        // zufaelige Person suchen
        VL20_Person randomPerson = allPersons[ (int) (Math.random() * allPersons.length) ];
        persons.contains(randomPerson);




        long end   = System.currentTimeMillis();

        System.out.println(end - start);


    }
}
