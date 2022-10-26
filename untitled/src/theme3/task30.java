package theme3;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        while (k < 1) {
            System.out.println("Enter the price of the first banana. It must be greater than or equal to 1");
            k = in.nextInt();
            if (k < 1) {
                System.out.println("does not meet the requirements");
            }
        }
        int n = 0;
        while (n>109 || n<=0){
            System.out.println("Enter the amount of money. It should be up to $109");
            n = in.nextInt();
            if (n>109 || n<=0){
                System.out.println("does not meet the requirements");
            }
        }
        int w = 0;
        while (w>1000 || w<=0){
            System.out.println("Enter the number of bananas");
            w = in.nextInt();
            if (w>1000 || w<0){
                System.out.println("does not meet the requirements");
            }
        }
        int i = 1;
        int s =0;
        while (i<=w){
            s=(s+i*k);
            i=i+1;
        }
       if (s>n){
           System.out.println((s-n));
       }
    }
}


