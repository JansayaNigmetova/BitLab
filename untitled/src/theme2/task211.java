package theme2;

import java.util.Scanner;

public class task211 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();

        if (month >= 1 && month <= 12 && year >=1001 && year<=2000) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}