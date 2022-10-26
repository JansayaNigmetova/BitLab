package theme3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = n;

        for (int i = n; i <= m; i++) {
            System.out.print(a);
            a = a + 1;
        }
    }
}
