package theme7;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = maxx(a, b, c);
        System.out.println(max);
    }

    public static int maxx(int a, int b, int c) {
        int maxx=0;
        if (a > c && a > b) {
            maxx = a;
        } else if (b > a && b > c) {
            maxx = b;
        } else {
            maxx = c;
        }
        return maxx;
        }
    }




