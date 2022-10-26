package theme7;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
            int c=0;
            for (int j=0;j<n;j++){
                int m =method (a,j);
                if(m!=0) {
                    System.out.println(m);
                }
            }
        }
    public static int method(int a[], int j){
        int m=0;
    if (a[j]<50 && a[j]%5==0) {
        m=a[j];
    }
    return m;
    }
}
