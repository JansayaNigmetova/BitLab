package theme3;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        int b = 3;
        for (int i = 0; i < n; i++) {
                s = s + b;
                b=b+3;
            }
        System.out.println(s);
        }
    }

