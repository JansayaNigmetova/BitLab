package theme2;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ((a-b) == 100 || (a-b) == -100) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
