package theme5;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int nm [][]= new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                nm [i][j]= in.nextInt();
            }
        }
        int nmm[]=new int[n];
        for (int i=0;i<n;i++){
            nmm [i]=nm[0][i];
        }
        for  (int i=0;i<n;i++){
        }
        for (int i=0;i<n;i++){
            nm [0][i]=nm [n-1][i];
        }
        for (int i=0;i<n;i++){
            nm[n-1][i]=nmm [i];
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(nm [i][j]+" ");
            }
            System.out.println();
        }
    }
}
