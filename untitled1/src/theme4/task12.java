package theme4;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        int s = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s = s + nm[i];
                a = a + 1;
            }
        }
            System.out.print(s/a);
        }
    }

