//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Atm myObj= new Atm();
        double deposit = myObj.deposit();
  String secondDeposit= myObj.deposit( "ch32",300);
   double thirdDeposit=  myObj.deposit("", 4000.0);
    }
}