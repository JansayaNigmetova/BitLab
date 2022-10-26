package theme4;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int m = in.nextInt();
        int r=0;
        for (int i=0;i<n;i++) {
            if (nm[i] == m) {
                System.out.println("YES" + i);
                r = r + 1;
            }
        }
            if (r<=0){
                System.out.println("NO");
            }
        }
    }

