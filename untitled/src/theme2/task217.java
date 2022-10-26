package theme2;

import java.util.Scanner;

public class task217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        if (a>20) {
            System.out.println(a/6);
        }
        if (a<20) {
            System.out.println (a*6);
        }
    }
}
