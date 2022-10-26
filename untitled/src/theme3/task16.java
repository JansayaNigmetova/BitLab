package theme3;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                s = s + 1;
            }
        }
        System.out.print(s);
    }
}
