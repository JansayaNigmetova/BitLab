package theme5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[][]= new int[2][n];
        for (int i=0;i<2;i++){
            for (int j=0;j<n;j++){
                nm[i][j]= in.nextInt();
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<n;j++){
                System.out.print(nm[i][j]);
            }
            System.out.println();
        }
    }
}
