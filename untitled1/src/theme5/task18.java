package theme5;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int nm [][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                nm [i][j]= in.nextInt();
            }
        }
        int max = 0;
        for (int i=0;i<n;i++){
            max = nm [i][0];
            for (int j=0;j<m;j++){
                if (nm[i][j]>max){
                    max=nm[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
