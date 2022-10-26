package theme11;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}
abstract class User{
    int id;
    String login;
    String password;
    public abstract String getUserData();
    protected User(){
        this.id=0;
        this.login=" ";
        this.password=" ";
    }
    protected User(int id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
class Student extends User{
    String name;
    String surname;
    String group;
    double gpa;
    protected Student(){
        super();
        this.name=" ";
        this.surname=" ";
        this.group=" ";
        this.gpa=0;
    }
    protected Student(int id, String login, String password, String  name,String surname, String group, double gpa){
        super(id,login,password);
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.gpa=gpa;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setLogin(String login) {
        super.setLogin(login);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getUserData(){
        return ("Id: "+id+" Login: "+login+" password: "+password+" name: "+name+" surname: "+surname+" group: "+group+" gpa: "+gpa);
    }
}class Teacher extends User{
    String nickName;
    String status;
    String subjects[]=new String[10];
    int sizeOfSubjects;

    public Teacher(){
        super();
        this.nickName=" ";
        this.status=" ";
    }
    public Teacher(int id, String login, String  password, String nickName, String status, int sizeOfSubjects){
        super(id,login,password);
        this.nickName=nickName;
        this.status=status;
    }
    public void addSubject(){
        Scanner in = new Scanner(System.in);
        while (true){
        System.out.println("Enter Enter subject. If you want to stop typing, type end ");
        String course= in.next();
        if ("end".equalsIgnoreCase(course) ) break;
        else subjects[sizeOfSubjects] = course;
        sizeOfSubjects++;
    }
    }
    public String getUserData(){
        return ("Id: "+id+" login: "+login+" password: "+password+" nickname: "+nickName+" status: "+status+subjects);
    }
    }
    class ERPSystem {
        User []memory=new User[1000];
        int sizeOfUsers;
        public ERPSystem(int sizeOfUsers){
            this.sizeOfUsers=sizeOfUsers;
        }
    public void addUserStudent(){
    User []memory = new User[1000];
        Scanner in = new Scanner(System.in);
    int i=0;
        Student student=new Student(in.nextInt(), in.next(), in.next(), in.next(),in.next(), in.next(),in.nextInt());
        memory[i++]=student;
    }
    public void addUserTeacher(){
        Scanner in = new Scanner(System.in);
        int i=0;
            Teacher teacher=new Teacher(in.nextInt(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt());
            teacher.addSubject();
            memory[i++]=teacher;
    }

}

