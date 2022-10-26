package theme3;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s = 0;
        for (int i=n; i<=m; i++) {
            s=s+i;}
        System.out.print(s);
    }
}
