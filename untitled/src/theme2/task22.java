package theme2;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 10 && n < 20) {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}