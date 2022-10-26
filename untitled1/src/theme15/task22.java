package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        System.out.println((numbers.stream().max((x,y)->x.compareTo(y)).get())-(numbers.stream().min((x,y)->x.compareTo(y)).get()));

    }
}
