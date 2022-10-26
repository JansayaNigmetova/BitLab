package theme12;

public class task1 {
    public static void main(String[] args) {
        User u1= new User("Aikyn", "Cmagulov");
        User u2= new User("John", "Petrov");
        User u3= new User("Aikyn", "Smith");
        User u4= new User("Samat", "Cmailov");
        User u5= new User("Kanat", "Ospanov");
        User u6= new  User("Aigul", "Augambaeva");
        User u7= new User ("Samat", "Petrov");
        User u8= new User("Aikin", "Cmailov");
        User u9=new User("Kanat", "Ospanov");
        User u10=new User("Aibek", "Smith");
        User[] users = {u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};
        UserBeanImp ubi = new UserBeanImp(users);
        ubi.getUsersByName("Aikyn");
        ubi.getAllUsers();
        ubi.getUsersBySurname("Cmailov");
    }
}
class User {
    String name;
    String surname;

    protected User() {
        this.name = " ";
        this.surname = " ";
    }

    protected User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

interface UserBean{
    int x = 0;
    public void getAllUsers();
    public void getUsersByName(String name);
    public void getUsersBySurname(String surname);
}
class UserBeanImp implements UserBean {
    User[] users;

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++)
            System.out.println("Name: " + users[i].name + " surname: " + users[i].surname);
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++)
            if (users[i].name.equalsIgnoreCase(name)) {
                System.out.println("Name: " + users[i].name + " surname: " + users[i].surname);
            }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++)
            if (users[i].surname.equalsIgnoreCase(surname)) {
                System.out.println("Name: " + users[i].name + " surname: " + users[i].surname);

            }
    }
}