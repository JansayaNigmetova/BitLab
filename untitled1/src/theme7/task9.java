package theme7;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mas[] = metod(n);
        for (int i = 0; i < n; i++) {
            if (mas[i] != 0) {
                System.out.print(mas[i]+" ");
            }
        }
    }

    public static int[] metod(int n) {
        Scanner in = new Scanner(System.in);
        int massiv[] = new int[n];
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (massiv[i] == 23) {
                i = n;
            } else {
                if (massiv[i] % 2 != 0) {
                    mas[i]=massiv[i];
                }
            }
        }
        return mas;
    }
}
