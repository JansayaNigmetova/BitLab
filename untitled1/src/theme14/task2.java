package theme14;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        BankApplication b1 = new BankApplication("Kazkom");
        Account a1 = new Account(1, "Kanat", "Smailov", 200.1);
        Account a2 = new Account(2, "Aygul", "Augambayeva", 532.1);
        Account a3 = new Account(3, "Aibek", "Tursinbek", 354);
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        BankApplication b2 = new BankApplication("BTA");
        Account a4 = new Account(4, "Ivan", "Petrov", 456.55);
        Account a5 = new Account(5, "Azamat", "Kusmanov", 675.23);
        Account a6 = new Account(6, "Altynay", "Ismailova", 642.88);
        b2.addAccount(a4);
        b2.addAccount(a5);
        b2.addAccount(a6);
        BankApplication b3=new BankApplication("Kaspi bank");
        Account a7 = new Account(7,"Alisher","Saduakasov",1078.56);
        Account a8 = new Account(8,"Anar","Moganova", 1564.23);
        Account a9 = new Account(9, "Zarina", "Cmagulova", 152.14);
        b3.addAccount(a7);
        b3.addAccount(a8);
        b3.addAccount(a9);
        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(b1);
        allBanks.add(b2);
        allBanks.add(b3);
        double max = 0;
        int n=0;
        for (int j = 0; j < allBanks.size()+n; j++) {
            max=0;
            n=n+1;
            for (int i = 0; i < allBanks.size(); i++) {
                if (max < allBanks.get(i).getAverageBalance()) {
                    max = allBanks.get(i).getAverageBalance();
                }
            }
            for (int i = 0; i < allBanks.size(); i++) {
                if (allBanks.get(i).getAverageBalance() == max) {
                    System.out.println(allBanks.get(i).getBankData());
                    allBanks.remove(i);
                }
            }
        }
    }
}
class Account{
    int id;
    String name;
    String surname;
    double balance;
    protected Account(int id, String name, String surname, double balance){
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
class BankApplication{
    String name;
    ArrayList<Account> accounts = new ArrayList();
    public BankApplication(String name){
        this.name=name;
    }
   public  void addAccount(Account a){
        accounts.add(a);
   }
   public void removeAccount(int i){
        accounts.remove(i);
   }
   public Account getMaxAccount(){
        double max=0;
        Account a1=new Account(0," "," ",0);
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