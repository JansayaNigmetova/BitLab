package theme5;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        int nm [][]= new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                nm [i][j]= in.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (nm[i][j]%2==1){
                    nm[i][j]=0;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(nm[i][j]+" ");
            }
            System.out.println();
        }
    }
}
