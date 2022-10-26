package theme3;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        int i = 1;
        while (i<=n){
            s=s+i*i;
            i=i+1;
        }
        System.out.println(s);
    }
}
