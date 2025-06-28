import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val > max) {
                max = val;
            }
        }

        System.out.println("Max = " + max);
        sc.close();
    }
}
