package theme12;

public class task2 {
    public static void main(String[] args) {
        Staff s1=new Staff(1, "Kanat", "Smailov", 200000);
        Staff s2=new Staff(2,"Samat", "Kopeshev", 250000);
        HRManagers h1=new HRManagers(11,"Aigul",310000);
        HRManagers h2=new HRManagers(12,"Sveta", 150000);
        Programmers p1 =new Programmers(21,"Jan", 450000, 250000, 0.5);
        Programmers p2 =new Programmers(22,"Slon", 850000, 150000, 0.4);
        Workers[] worker={s1,s2,h1,h2,p1,p2};
        Workers[] WD=worker;
        double max=0;
        for (int i=0; i<6;i++){
            if (worker[i].getSalary()>max){
                max=worker[i].getSalary();
            }
        }
        for (int i=0; i<6;i++){
            if (worker[i].getSalary()==max){
                System.out.println(worker[i].getWorkerData());
            }
        }
        for (int j=0;j<6;j++) {
            max=0;
            for (int i = 0; i < 6; i++) {
                if (WD[i].getSalary() > max) {
                    max = WD[i].getSalary();
                }
            }
            for (int i = 0; i < 6; i++) {
                if (WD[i].getSalary() == max) {
                    System.out.println(worker[i].getWorkerData());
                    WD[i].setSalary(0);
                }
            }
        }
    }
}
interface Workers{
    String getWorkerData();
    double getSalary();
    void setSalary(double salary);
}
class Staff implements Workers {
    int id;
    String name;
    String surname;
    double salary;
    public Staff(int id, String name, String surname, double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    @Override
    public String getWorkerData() {
        return ("Id: "+id+" name: "+name+" Surname: "+surname+" salary: "+salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class HRManagers implements Workers{
    int id;
    String fullName;
    double salary;
    public HRManagers(int id, String fullName, double salary){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
    }

    @Override
    public String getWorkerData() {
        return ("Id: "+id+ " fullName: "+fullName+" salary: "+salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Programmers implements Workers{
    int id;
    String nickname;
    double salary;
    int bonusSalary;
    double KPIValue;
    public Programmers(int id, String nickname, double salary, int bonusSalary, double KPIValue){
        this.id=id;
        this.nickname=nickname;
        this.salary=salary;
        this.bonusSalary=bonusSalary;
        this.KPIValue=KPIValue;
    }

    @Override
    public String getWorkerData() {
        return ("Id: "+id+" nickname: "+nickname+" Salary: "+salary+" bonusSalary: "+bonusSalary+" KPIValue: "+KPIValue);
    }

    @Override
    public double getSalary() {
        return (salary + KPIValue*bonusSalary);
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}