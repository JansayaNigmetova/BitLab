package theme4;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        int k = 1;
        for (int i = 0; i < n; i++) {
            if (nm[i] != 0 && i % 2 == 0) {
                k = k * nm[i];
            }
        }
                System.out.println(k);
            }
        }


