package theme4;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        int s=0;
        for (int i=0; i<n; i++) {
            s = s + nm[i];
        }
        System.out.print(s+" ");
        System.out.print(s/n);
    }
}
