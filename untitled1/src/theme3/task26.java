package theme3;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner in = new Scanner(System.in);
        int i = 1;
        int s =0;
        while (i!=0) {
            i = in.nextInt();
            if (i % 2 == 1) {
                s = s + i;
            }
        }
            System.out.println("Sum of odd numbers="+s);
    }
}
