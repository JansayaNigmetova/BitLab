package theme7;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = a[i];
            int b = method(a, n, s);
            if (b != -1) {
                System.out.print(b + " ");
            }
        }
    }
        public static int method(int a[], int n, int s) {
        int b=-1;
        int m=0;
        for (int i=0;i<n;i++){
            if (a[i]==s){
                m=m+1;
            }
        }
        if (m==1){
            b=s;
        }
        return b;
    }
}
