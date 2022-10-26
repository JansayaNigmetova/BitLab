package theme4;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int min = nm[0];
        int max = nm[0];
        for (int i=0;i<n;i++){
            if(nm[i]>max){
                max=nm[i];
            }
            if(nm[i]<min){
                min=nm[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
