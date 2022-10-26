package theme2;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 100 || n < -100) {
            System.out.println(0);
        }
        else {
            System.out.println(n + 1);
        }
    }
}