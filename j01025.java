public class j01025 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int xtd1 = sc.nextInt(), ytd1 = sc.nextInt(), xpt1 = sc.nextInt(), ypt1 = sc.nextInt();
        int xtd2 = sc.nextInt(), ytd2 = sc.nextInt(), xpt2 = sc.nextInt(), ypt2 = sc.nextInt();

        int width = Math.abs(Math.max(xpt1, xpt2) - Math.min(xtd1, xtd2));
        int height = Math.abs(Math.max(ypt1, ypt2) - Math.min(ytd1, ytd2));

        int area = Math.max(width, height) * Math.max(width, height);

        System.out.println(area);
        sc.close();
    }
}   
