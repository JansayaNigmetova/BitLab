package book;

import java.awt.*;
import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i =0;
        int s =0;
        while (i<=n){
            s=s+(i+n)*(i+n);
            i=i+1;
        }
        System.out.println(s);
    }
}
