package theme4;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (nm[i] % k == 0) {
                System.out.println(nm[i]);
            }
        }
    }
}