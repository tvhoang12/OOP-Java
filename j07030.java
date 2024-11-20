import java.io.*;
import java.util.*;

public class j07030 {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Read ArrayList<Integer> from DATA1.in
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> data1 = (ArrayList<Integer>) in1.readObject();
        in1.close();

        // Read ArrayList<Integer> from DATA2.in
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> data2 = (ArrayList<Integer>) in2.readObject();
        in2.close();

        // Use HashSet to store unique prime numbers from both files
        TreeSet<Integer> primesData1 = new TreeSet<>();
        TreeSet<Integer> primesData2 = new TreeSet<>();

        // Collect primes from DATA1.in
        for (int num : data1) {
            if (isPrime(num)) {
                primesData1.add(num);
            }
        }

        // Collect primes from DATA2.in
        for (int num : data2) {
            if (isPrime(num)) {
                primesData2.add(num);
            }
        }

        // Find and print pairs (n, m) such that n + m = 1000000
        for (int n : primesData1) {
            int m = 1000000 - n;
            if (m > n && primesData1.contains(m) && !primesData2.contains(m) && !primesData2.contains(n)) {
                System.out.println(n + " " + m);
            }
        }

    }
}
