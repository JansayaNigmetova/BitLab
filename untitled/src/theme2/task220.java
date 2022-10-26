package theme2;

import java.util.Scanner;

public class task220 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            a=a+1;
            System.out.println(a);
        } else if (a<=0){
            System.out.println(a);
        }
    }
}
