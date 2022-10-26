package theme3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=n;
        int b=1;
        {
            for (int i = 0; i < a; i++) {

                System.out.print(b);
                b = b + 1;
            }
        }
    }
}