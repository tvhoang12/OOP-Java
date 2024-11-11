import java.util.Scanner;

class Pair<key, value> {
    private key key;
    private value value;

    public Pair(key key, value value) {
        this.key = key;
        this.value = value;
    }

    public static <key, value> Pair of (key k, value v) {
        return new Pair<>(k, v);
    }

    public key getKey() {
        return key;
    }

    public value getValue() {
        return value;
    }

    public boolean isPrime() {
        if(isPrimeNumber(Integer.parseInt(key.toString())) 
            && isPrimeNumber(Integer.parseInt(value.toString()))) return true;
        return false;
    }

    public boolean isPrimeNumber(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}

public class j04020 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
