package theme3;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i=n; i<=m; i++) {
            if (i%2==1) {
                System.out.print(i);
            }
        }
    }
}
