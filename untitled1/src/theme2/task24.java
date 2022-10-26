package theme2;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 2019) {
            System.out.println("NO");
        } else if (n >= 2021) {
            System.out.println("YES");
        }
        else if (n == 2020) {
            System.out.println("Error");
        }
    }
}
