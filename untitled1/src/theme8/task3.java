package theme8;


public class task3 {
    public static void main(String[] args) {
        Student h1 = new Student(51, "bdfb", "dfbdf", 3.5);
        Student h2 = new Student(43, "xnnfg", "dfkubdf", 7.5);
        Student h3 = new Student(10, "yfyf", "ytzh", 3.7);
        Student h4 = new Student(23, "gzd", "juju", 5.0);
        Student h5 = new Student(18, "kgu", "afv", 8.0);
        Student aa[] = {h1, h2, h3, h4, h5};
        for (int i = 0; i < 5; i++) {
            System.out.println(aa[i].getStudentData());
        }
    }
}

     class Student {
            int id;
            String name;
            String surname;
            double gpa;

            public Student() {
                this.id = 0;
                this.name = " ";
                this.surname = " ";
                this.gpa = 0;
            }

            public Student(int id, String name, String surname, double gpa) {
                this.id = id;
                this.name = name;
                this.surname = surname;
                this.gpa = gpa;
            }

            public String getStudentData() {
                return "id: " + id + " name: " + name + " surname: " + surname + " gpa: "+gpa;
            }
        }



