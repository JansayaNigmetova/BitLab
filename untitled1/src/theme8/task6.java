package theme8;

public class task6 {
    public static void main(String[] args) {
        Player p1=new Player (1, "vhj", "hjgh", "hjkh");
        Player p2=new Player (2, "dgnd", "ngdn", "dbs");
        Player p3=new Player (3, "htrah", "gfWGRGd", "HYS");
        Player p4=new Player (4, "hth", "rHHg", "jyf");
        Player p5=new Player (5, "shh", "hdhd", "jfgf");
        Player p6=new Player (1, "hdht", "htdh", "kgk");
        Player p7=new Player (2, "hfh", "jyfj", "zg");
        Player p8=new Player (3, "hf", "mhgm", "cv");
        Player p9=new Player (4, "bfd", "ngzn", "mhgx");
        Player p10=new Player (5, "hdh", "jg", "sg");

        Player[] players1= {p1,p2,p3,p4,p5};
        Player[] players2= {p6,p7,p8,p9,p10};
        clab clab1 = new clab("bdfb","bfdbd",1000,players1);
        clab clab2=new clab("dfhd","gfdgd",2000,players2);
        clab[] clabs={clab1, clab2};
        for (int i=0; i< clabs.length;i++){
            clabs[i].getClabData();

        }
    }
}
class Player{
    int number;
    String name;
    String surname;
    String position;
    public Player () {
        this.number = 0;
        this.name = " ";
        this.surname = " ";
        this.position = " ";
    }
    public Player (int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }
    public String getPlayerData() {
        return number+" "+name+" "+surname+" "+position;
    }
}
class clab {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public clab() {
        this.name = " ";
        this.country = " ";
        this.ratingPoints = 0;
    }

    public clab(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players=players;
    }

    public void getClabData() {
        System.out.println(name + " " + country + " " + ratingPoints);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
