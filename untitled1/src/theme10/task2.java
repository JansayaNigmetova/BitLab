package theme10;

public class task2 {
    public static void main(String[] args) {
        Gymnast g1 = new Gymnast("dghdh",40,"USA",3,10 );
        Gymnast g2 = new Gymnast("bdgd",20,"Kazakhstan",20,15);
        Gymnast g3 = new Gymnast("nffs",32,"China",15,14);
        Footballer f1 = new Footballer("ngfn",25,"China","fnfn","sfbb");
        Footballer f2 = new Footballer(",jh",21,"Canada","fguu","dagdg");
        Footballer f3 = new Footballer("kugu",23,"Australia","kug","vsf");
        Swimmer s1 = new Swimmer("ggjg",25,"Kazakhstan","brus", 2.4);
        Swimmer s2 = new Swimmer("fsf",22,"Kazakhstan","fdsf", 3.1);
        Swimmer s3 = new Swimmer("hgf",24,"Kazakhstan","brnfnus", 1.8);
        s1.setStyle("butterfly");
        f1.setAge(-5);
        Sportsman[] sportsmenList1={g1,g2,g3,f1,f2,f3,s1,s2,s3};

        OlympicGames og =new OlympicGames("Birge", 10, "China", "Almaty", 20, sportsmenList1);
        for (int i=0; i<sportsmenList1.length; i++){
            sportsmenList1[i].play();
        }
    }
}
class Sportsman{
    String fullName;
    int age;
    String country;
    public Sportsman (String fullName, int age,String country){
        this.fullName=fullName;
        this.age=age;
        this.country=country;
    }
    public void play (){
        System.out.println("fullName "+fullName+" "+age+" country "+country);

    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("error: age can't be negative");
        }
        else {
            this.age = age;
        }

    }

}
class Gymnast extends Sportsman {
    int height;
    int weight;
    String style;

    public Gymnast(String fullName, int age, String country, int height, int weight) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
    }

    public void play() {
        System.out.println("fullName " + fullName + " " + age + " country " + country + " " + height + " " + weight);
    }
}
class Footballer extends Sportsman{
    String position;
    String club;
    public Footballer (String fullName, int age, String country, String position, String club){
        super(fullName,age,country);
        this.position=position;
        this.club=club;
    }
    public void play() {
        System.out.println("fullName " + fullName + " " + age + " country " + country + " position  " + position + " club " + club);
    }
}
class Swimmer extends Sportsman {
    private String style;
    double recordTime;

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public void play() {
        System.out.println("fullName " + fullName + " " + age + " country " + country + " style  " + style + " club " + recordTime);
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
class OlympicGames extends Sportsman {
    String city;
    int year;
    Sportsman[] sportsmansList;

    public OlympicGames (String fullName, int age, String country,String city,int year, Sportsman [] sportsmansList){
        super(fullName, age,country);
        this.city=city;
        this.year=year;
        this.sportsmansList=sportsmansList;
    }
    public void play() {
        System.out.println("fullName " + fullName + " " + age + " country " + country+" city "+ city+" year "+year+sportsmansList);
    }

}
