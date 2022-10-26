package theme4;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0; i<n;i++){
            nm[i]= in.nextInt();
        }
        int min =nm[0];
        int max = nm[0];
        int nmin=0;
        int nmax=0;
        for (int i=1;i<n;i++){
            if (nm[i]>max){
                max=nm[i];
                nmax=i;
            }
            if (nm[i]<min){
                min=nm[i];
                nmin=i;
            }
        }
        nm[nmax]=min;
        nm[nmin]=max;
        for (int i=0;i<n;i++){
            System.out.print(nm[i]+" ");
        }
    }
}
