package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        numbers.stream().forEach(a-> System.out.print(a*a+" "));
    }
}
