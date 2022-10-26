package theme15;

import java.util.ArrayList;

public class task202 {
    public static void main(String[] args) {
        BankApplicationB b1 = new BankApplicationB("Kazkom");
        AccountA a1 = new AccountA(1, "Kanat", "Smailov", 200.1);
        AccountA a2 = new AccountA(2, "Aygul", "Augambayeva", 532.1);
        AccountA a3 = new AccountA(3, "Aibek", "Tursinbek", 354);
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        BankApplicationB b2 = new BankApplicationB("BTA");
        AccountA a4 = new AccountA(4, "Ivan", "Petrov", 456.55);
        AccountA a5 = new AccountA(5, "Azamat", "Kusmanov", 675.23);
        AccountA a6 = new AccountA(6, "Altynay", "Ismailova", 642.88);
        b2.addAccount(a4);
        b2.addAccount(a5);
        b2.addAccount(a6);
        BankApplicationB b3=new BankApplicationB("Kaspi bank");
        AccountA a7 = new AccountA(7,"Alisher","Saduakasov",1078.56);
        AccountA a8 = new AccountA(8,"Anar","Moganova", 1564.23);
        AccountA a9 = new AccountA(9, "Zarina", "Cmagulova", 152.14);
        b3.addAccount(a7);
        b3.addAccount(a8);
        b3.addAccount(a9);
        ArrayList<BankApplicationB> allBanks = new ArrayList<>();
        allBanks.add(b1);
        allBanks.add(b2);
        allBanks.add(b3);

    }
}
class AccountA{
    int id;
    String name;
    String surname;
    double balance;
    protected AccountA(int id, String name, String surname, double balance){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        String string="Id: "+id+" name: "+ name+" surname: "+surname+"balance: "+balance;
        return string;
    }
}
class BankApplicationB{
    String name;
    ArrayList<AccountA> accounts = new ArrayList();
    public BankApplicationB(String name){
        this.name=name;
    }
    public  void addAccount(AccountA a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public AccountA getMaxAccount(){
        double max=0;
        AccountA a1=new AccountA(0," "," ",0);
        for(int i=0;i< accounts.size();i++){
            if (accounts.get(i).balance>max){
                max=accounts.get(i).balance;
            }
        }
        for (int i=0; i< accounts.size();i++){
            if(accounts.get(i).balance==max){
                a1=accounts.get(i);
            }
        }
        return a1;
    }
    public double getAverageBalance(){
        double n=0;
        for (int i=0;i< accounts.size();i++){
            n=n+accounts.get(i).balance;
        }
        return n/accounts.size();
    }
    public double getTotalBalance(){
        double sum=0;
        for (int i=0;i< accounts.size();i++){
            sum=sum+accounts.get(i).balance;
        }
        return sum;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public String getBankData(){
        double sum=0;
        for (int i=0;i< accounts.size();i++){
            sum=sum+accounts.get(i).balance;
        }
        double n=0;
        for (int i=0;i< accounts.size();i++){
            n=n+accounts.get(i).balance;
        }
        n=n/accounts.size();
        return ("Bank name: "+name+" number of accounts: "+accounts.size()+" balance amount: "+sum+" average balance value: "+n);
    }
}
