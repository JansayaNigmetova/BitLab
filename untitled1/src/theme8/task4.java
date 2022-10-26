package theme8;

public class task4 {
    public static void main(String[] args) {
        Student2 h1 = new Student2(51, "bdfb", "dfbdf", 3.5);
        Student2 h2 = new Student2(43, "xnnfg", "dfkubdf", 7.5);
        Student2 h3 = new Student2(10, "yfyf", "ytzh", 3.7);
        Student2 h4 = new Student2(23, "gzd", "juju", 5.0);
        Student2 h5 = new Student2(18, "kgu", "afv", 8.0);
        Student2 h6 = new Student2(51, "jjg", ",kgkg", 8.1);
        Student2 h7 = new Student2(43, "xnnhfsfg", "lgl", 5.3);
        Student2 h8 = new Student2(10, "afd", "hkh", 1.4);
        Student2 h9 = new Student2(23, "gnz", "dh", 4.3);
        Student2 h10 = new Student2(18, "kjh", "dfh", 9.1);
        Student2 aa[] = {h1, h2, h3, h4, h5,h6,h7,h8,h9,h10};

            Student2 ss=topStudent (aa);
        System.out.println(ss.getStudentData());

    }
    public static Student2 topStudent(Student2 aa[]){
        double max=0;
        Student2 ss = new Student2();
        for (int i=0;i<10;i++){
            if (aa[i].gpa>max){
                max=aa[i].gpa;
                ss=aa[i];
            }
        }
        return ss;
    }
    }

class Student2 {
    int id;
    String name;
    String surname;
    double gpa;

    public Student2() {
        this.id = 0;
        this.name = " ";
        this.surname = " ";
        this.gpa = 0;
    }

    public Student2(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return "id: " + id + " name: " + name + " surname: " + surname + " gpa: "+gpa;
    }
}
