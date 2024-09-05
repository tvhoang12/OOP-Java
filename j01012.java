import java.util.BitSet;

public class j01012 {
     static BitSet sieve(BitSet bitSet) {
        bitSet.set(0, false); // 0 không phải số nguyên tố
        bitSet.set(1, false); // 1 không phải số nguyên tố

        int limit = (int) Math.sqrt(bitSet.size());

        for (int i = 2; i <= limit; i++) {
            if (bitSet.get(i)) {
                for (int j = i * i; j < bitSet.size(); j += i) {
                    bitSet.set(j, false);
                }
            }
        }
        return bitSet;
    }
    public static void main(String [] args) {
        BitSet arr = new BitSet(1000000001);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sieve(arr);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int countNumberDevide2 = 0;
            while(n % 2 == 0) {
                n /= 2;
                countNumberDevide2 ++;
            }
            if(countNumberDevide2 == 0) {
                System.out.println(countNumberDevide2);
            }
            else {
                int count = 0;
                int z = 3;
                while(n > 1) {
                    if(n % z == 0 && arr.get(z)) {
                        while(n % z == 0) {
                            count ++;
                            n /= z;
                        }
                        countNumberDevide2 *= (count + 1);
                        count = 0;
                    }
                    z += 2;
                }
                if(n > 1) {
                    countNumberDevide2 *= 2;
                }
                System.out.println(countNumberDevide2);
            }
        }
        sc.close();
    }
}
