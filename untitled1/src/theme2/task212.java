package theme2;

import java.util.Scanner;

public class task212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b && a>c && a*a==(b*b+c+c)) {
            System.out.println("YES");
        } else if (b>a && b>c && b*b==(a*a+c*c)) {
            System.out.println("YES");
        }
        else if (c>a && c>b && c*c==(a*a+b*b)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
