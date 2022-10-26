package theme7;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][]=new int [n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]= in.nextInt();
            }
        }
        int max[]=method(n,m,a);
        for (int i=0;i<n;i++){
            System.out.println(max[i]);
        }
    }
    public static int [] method(int n, int m, int a[][]){
        int max=a[0][0];
        int maxx[]=new int[n];
        for (int i=0;i<n;i++){
            max=a[i][0];
            for (int j=1;j<m;j++){
                if (a[i][j] > max) {
                    max=a[i][j];
                }
            }
        maxx[i]=max;
        }
        return maxx;
    }
}
