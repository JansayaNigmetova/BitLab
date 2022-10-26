package theme3;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a<b) {
            while (a != b) {
                if (a%d == c) {
                    System.out.println(a);
                }
                a = a + 1;
            }
        }
        if (b<a){
            while (a!=b){
                if (b%d==c){
                    System.out.println(b);
                }
                b=b+1;
            }
        }
        }
    }

