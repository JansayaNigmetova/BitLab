package theme4;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int max =0;
        int index=0;
        for (int i=0;i<n;i++){
            if (nm[i]>max){
                max=nm[i];
                index=i;
            }
        }
        System.out.println(max+" "+index);
    }
}
