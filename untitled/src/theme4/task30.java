package theme4;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]= new int[n];
        for (int i =0; i<n; i++){
            nm[i]= in.nextInt();
        }
        int i=1;
        int m =0;
        if (nm[0]>0) {
            while (i < n) {
                if (nm[i] > 0 || nm[i + 1] < 0) {
                    System.out.println("NO");
                    i = n;
                    m=1;
                } else {
                    i = i + 2;
                }
            }
        }
        i=1;
        if (nm[0]<0) {
            while (i < n) {
                if (nm[i] < 0 || nm[i + 1] > 0) {
                    System.out.println("NO");
                    i = n;
                    m=1;
                } else {
                    i = i + 2;
                }
            }
        }
if (m==0){
    System.out.println("YES");
    }

    }
}
