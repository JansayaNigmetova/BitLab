package theme5;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int nm[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nm[i][j] = in.nextInt();
            }
        }
        int s=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                s=s+nm[i][j];
            }
            System.out.println(s);
            s=0;
        }
    }
}
