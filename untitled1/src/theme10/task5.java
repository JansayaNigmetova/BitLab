package theme10;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = 0;
        User[] users = new User[1000];
        int n=5;
        while (n!=0) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            n = in.nextInt();

            if (n == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                int nn = in.nextInt();
                if (nn == 1) {
                    System.out.println("Enter id, login, password, name, surname, gpa");
                    Student s1 = new Student(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                    users[index] = s1;
                    index++;
                }
                if (nn == 2) {
                    System.out.println("Enter id, login, password, name, surname, salary");
                    Staff staff = new Staff(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                    System.out.println("Enter subjects, when enter end input will brake");
                    while(true){
                        String subj = in.next();
                        if(subj.equalsIgnoreCase("end")) break;
                        staff.addSubject(subj);
                    }

                    users[index] = staff;
                    index++;
                }
            }
            if (n == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                int nnn = in.nextInt();

                if (nnn == 2) {
                    for (int i = 0; i < index; i++) {
                        if(users[i] instanceof Staff){
                            System.out.println(((Staff) users[i]).getData());
                        }
                    }
                }
            }
        }
    }
}
class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User (){

    }
    public User(int id, String login, String password, String name, String surname){
        this.id=id;
        this.login=login;
        this.password=password;
        this.name=name;
        this.surname=surname;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void detData(){
        System.out.println("id "+id+" login "+login+" password "+password+" name "+name+" surname "+surname);
    }
}
class Staff extends User{
    private double salary;
    private int indexOfSubject;
    private String subjects[] =new String[100];

    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id,login, password,name, surname);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }
    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject = indexOfSubject + 1;
    }
    public String getData(){
        String ans = "id "+id+" login "+login+" password "+password+" name "+
                name+" surname "+surname+" salary "+salary+" indexOfSubject "+indexOfSubject+" subjects: \n";
        for (int i=0; i<indexOfSubject;i++){
            ans = ans + subjects[i]+", \n";
        }
        return  ans;
    }
}
class Student extends User{
    private double gpa;
    private int indexOfCourses;
    public Student (int id, String login, String password, String name, String surname, double gpa){
        super(id,login, password,name, surname);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public static String[] addCourse(){
        Scanner in = new Scanner(System.in);
        String courses1[] =new String[100];
        courses1[0]=" ";
        int index =0;
        int n=0;
        while (n==0){
            System.out.println("Enter courses for student. If you want to stop typing, type end ");
            String courses= in.next();
            if ("end".equalsIgnoreCase(courses) ){
                n=1;
            }
            else {
                courses1[index] = courses;
                index = index + 1;
            }
        }
        String courses[]=new String[index];
        for (int i=0;i<index;i++){
            courses[i]=courses1[i];
        }
        return courses;
    }

    public void detData(){
        String courses[]=addCourse();
        int index=courses.length;
        this.indexOfCourses=index;
        System.out.println("id "+id+" login "+login+" password "+password+" name "+name+" surname "+surname+" gpa "+gpa+" indexOfCourses "+indexOfCourses+" courses: ");
        for (int i=0; i<courses.length;i++){
            System.out.print(courses[i]+", ");
        }
        System.out.println();
    }

}