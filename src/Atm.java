import java.util.Scanner;

public class Atm{

 private  double initialBalance = 0;

 public double deposit(){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter amount to deposit");
     double amount = sc.nextDouble();
     double balance= this.initialBalance+ amount;
     System.out.println("the amount deposited is " +amount + "current balance is" + balance);
     return balance;
 }
 public   String deposit (String checkNumber, int amount){

     Scanner sc= new Scanner(System.in);
     System.out.println("enter your checkNumber and amount to deposit");
     String checkCredentials= sc.nextLine();
     int moneyDepositing= sc.nextInt();
   double balance=this.initialBalance + moneyDepositing;
     return ("check number:" + checkCredentials + " " + " amount deposited" + moneyDepositing +" "+  "balance="+ balance);
 }

    public   double deposit (String phoneNumber, double amount){
        Scanner d= new Scanner(System.in);
        System.out.println("enter your phoneNumber and amount to deposit");

        String phoneNumberCredentials= d.nextLine();
      double moneyDepositing= d.nextDouble();
        double balance=this.initialBalance + moneyDepositing;
        System.out.println("Phone number:" + phoneNumberCredentials + " amount deposited" + moneyDepositing + "balance="+ balance);
        return initialBalance;
    }



}