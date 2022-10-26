import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        User [] Users=new User[5];
        for (int i=0;i<Users.length; i++){
            System.out.println("Enter User");
            User u1=new User(" "," ",1);
            u1.name= in.nextLine();
            u1.surname=in.nextLine();
            try{
                u1.age = Integer.parseInt(in.nextLine());
            }catch(Exception e){
                u1.age = 0;
                System.out.println("Insert correct age");
            }

            Users[i]=u1;
            sum=sum+u1.age;
        }
        System.out.println(sum/5);
    }
}
class User{
    String name;
    String surname;
    int age;
    public User(String name, String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
        if (age<0){
            this.age=0;
        }
        else this.age=age;

    }
}
