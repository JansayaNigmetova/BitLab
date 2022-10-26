package theme5;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        int nm [][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                nm[i][j]= in.nextInt();
            }
        }
        int max=nm[0][0];
        int min=nm[0][0];
        int mini=0;
        int minj=0;
        int maxj=0;
        int maxi=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (nm[i][j]>max){
                    max=nm[i][j];
                    maxi=i;
                    maxj=j;
                }
                if (nm[i][j]<min){
                    min=nm[i][j];
                    mini=i;
                    minj=j;
                }
            }
        }
      nm[maxi][maxj]=min;
        nm[mini][minj]=max;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(nm[i][j]+" ");
            }
            System.out.println();
        }
    }
}
