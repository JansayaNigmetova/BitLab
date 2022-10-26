package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        System.out.println(numbers.stream().filter(a->a%2==0).count());

    }
}
