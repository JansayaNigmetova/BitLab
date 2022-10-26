package theme3;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        int s = 0;
        int a = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        while(a!=0) {
            a = in.nextInt();
            s = s + 1;
            }
        System.out.println("Amount of numbers="+(s-1));
    }
}
