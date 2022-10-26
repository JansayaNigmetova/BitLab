package theme2;

import java.util.Scanner;

public class task210 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a%2!=0) {
            a=0;
        }
      if (b%2!=0) {
          b = 0;
      }
      if (c%2!=0) {
          c = 0;
      }
      if (d%2!=0) {
          d = 0;
      }
      if (a>b && a>c && a>d) {
          System.out.println(a);
      }
        else if (b>a && b>c && b>d) {
          System.out.println(b);
      }
      else if (c>a && c>b && c>d) {
          System.out.println(c);
      }
      else if (d>a && d>b && d>c) {
          System.out.println(d);
      }
      else {
          System.out.println("Not Found");
      }


                 }
    }

