package theme4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        for (int i=0; i<n; i++) {
            if (i%2==1) {
                System.out.println(nm[i]);
            }
        }
    }
}
