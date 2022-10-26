package theme3;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1;
        double s = 1;
        System.out.println("Enter numbers");
        while (n!=0) {
            n = in.nextDouble();
            if (n!=0) {
                s=s*n;
            }
        }
        System.out.println("Product of numbers="+s);
    }
}
