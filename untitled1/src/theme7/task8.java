package theme7;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int aa[][] = metod(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] metod(int n){
        Scanner in = new Scanner(System.in);
        int aa[][]=new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                aa[i][j]= in.nextInt();
            }
        }
        int c[]=new int[n];
        for (int i=0;i<n;i++){
            c[i]=aa[0][i];
            aa[0][i]=aa[n-1][i];
            aa[n-1][i]=c[i];
        }
        return aa;
    }
}
