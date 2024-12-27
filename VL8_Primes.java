
// Aufgabe: die ersten 20 Primzahlen bestimmen und ausgeben

// Ueberlegung 1:
//   ersten 20 Primzahlen bestimmen 
//   Ergebnis ausgeben

// Ueberlegung 2:
//   betrachte n = 2, ... , n solange keine 20 Primzahlen gefunden
//   ist n eine Primzahl?
//   falls ja , abspeichern
//   falls nein, betrachte nächst größeres n

// Ueberlegung 3:
//   isPrime(n) 
//     -> true, falls n eine Primzahl ist
//     -> false, andernfalls
//     Implementierung: hat keinen Teiler zwischen 1 und n (2 ... n-1)

public class VL8_Primes {

    private static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] getPrimes(int numberOfPrimes) {
        int[] primes = new int[numberOfPrimes];
        int primesFound = 0;

        for (int n = 2; primesFound < numberOfPrimes; n++) {
            if (isPrime(n)) {
                primes[primesFound] = n;
                primesFound++;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int[] primes = getPrimes(20);

        for(int prime: primes) {
            System.out.println(prime);
        }
    }
}