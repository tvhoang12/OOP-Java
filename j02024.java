import java.util.*; 
public class J02024 {
    
    public static List<String> list = new ArrayList<>(); 
    //generate binary
    public static void generateBinaryStrings(int n, String str) { 
        if (str.length() == n) { 
            list.add(str); 
            return; 
        } 
        generateBinaryStrings(n, str + "0"); 
        generateBinaryStrings(n, str + "1"); 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        int t = sc.nextInt(); 
        while(t-->0){ 
            list.clear(); 
            List<List<Integer>> in = new ArrayList<>(); 
            int n = sc.nextInt(); 
            generateBinaryStrings(n, ""); 
            int[] arr = new int[n]; 
            for(int i=0;i<n;i++){ 
                arr[i]=sc.nextInt(); 
            } 
            Arrays.sort(arr); 
            for (int i = 0; i < n / 2; i++) { 
                int temp = arr[i]; 
                arr[i] = arr[n - i - 1]; 
                arr[n - i - 1] = temp; 
            } 
            for(String s : list){ 
                int tong =0; 
                List<Integer> tmp = new ArrayList<>(); 
                for(int i =0;i<n;i++){ 
                    if(s.charAt(i)=='1'){ 
                        tong = tong+arr[i]; 
                        tmp.add(arr[i]); 
                    } 
                } 
                if(tong%2!=0){ 
                    in.add(tmp); 
                } 
            } in.sort((a,b)->{ int let = Math.min(a.size(), b.size()); 
                for(int i=0;i<let;i++){ 
                    if(!a.get(i).equals(b.get(i))){ 
                        return a.get(i) - b.get(i); 
                    } 
                } return a.size()-b.size(); 
            }); 
            for(List<Integer> c : in){ 
                for(int j : c){ 
                    System.out.print(j+" "); 
                } 
                System.out.println(); 
            } System.out.println(); 
        } 
    } 
}