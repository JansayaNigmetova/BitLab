package theme8;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=3;
        int a=3;
        int n =1;
        boy bb[] = new boy[1000];
        while (m!=0) {

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            a = in.nextInt();
            if (a==1){
                boy bn= method();
                bb[n-1] = bn;
                n=n+1;
            }
            if (a==2) {
                for (int i = 0; i < n-1; i++) {
                    System.out.println(bb[i].getBoyData());
                }
            }
            if (a==0){
                System.out.println("End");
                m=0;
            }
        }
    }
            public static boy  method () {
        Scanner inn = new Scanner(System.in);
                System.out.println("Insert name? ");
                String name = inn.next();
                System.out.println("Insert surname?");
                String surname = inn.next();
                System.out.println("Insert GPA?");
                double gpa = inn.nextDouble();
                boy bn = new boy(name, surname, gpa);
                bn.getBoyData();
                return bn;
        }
    }
    class boy {
    String name;
    String surname;
    double gpa;
    public boy(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public String getBoyData() {
        return name+" " +  surname+" "  + gpa;
    }
}