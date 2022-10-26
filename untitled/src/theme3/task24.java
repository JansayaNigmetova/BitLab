package theme3;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        int n = 1;
        int s =1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
            n = in.nextInt();
            while(i<=n){
            s=s*i;
            i=i+1;
            }
            System.out.println("Product of numbers="+s);
    }
}
