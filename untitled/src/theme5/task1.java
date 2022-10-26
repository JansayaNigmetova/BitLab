package theme5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int nm[][]=new int[4][4];
        nm[0][0]=12;
        nm[0][1]=5;
        nm[0][2]=7;
        nm[0][3]=6;
        nm[1][0]=4;
        nm[1][1]=0;
        nm[1][2]=2;
        nm[1][3]=7;
        nm[2][0]=9;
        nm[2][1]=1;
        nm[2][2]=3;
        nm[2][3]=2;
        nm[3][0]=10;
        nm[3][1]=-2;
        nm[3][2]=4;
        nm[3][3]=6;
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        System.out.println(nm[n][m]);
    }
}
