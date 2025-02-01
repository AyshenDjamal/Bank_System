//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankCustomer num1 = new BankCustomer();
        System.out.println("------Her Info-------");
        num1.getInfo();
        System.out.println("\n-----Her Debit Account------");
        num1.checkBalance();
        num1.addFunds();
        num1.removeFunds();


        DebitCardAccount.accountStatus();
        System.out.println("\n----Her Credit Account----");
        CreditAccount.creditLimit();
        num1.creditBalance();
        num1.loyaltyPoints();  // default method


    }
}