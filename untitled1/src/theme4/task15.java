package theme4;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = in.nextInt();
        }
        int s = 1;
        for (int i = 0; i < n; i++) {
            if (nm[i]!=0)
            s = s * nm[i];
        }
        System.out.println(s);
        }
    }

