package theme3;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 0; i <= n*2; i++) {
            if (i % 2 == 1) {
                s = s + i;
            }
        }
        System.out.print(s);
    }
}
