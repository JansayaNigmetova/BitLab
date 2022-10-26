package theme4;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int i =n-1;
        while (i>=0){
            System.out.print(nm[i]+" ");
            i=i-1;
        }
    }
}
