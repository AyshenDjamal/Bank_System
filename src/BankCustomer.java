public class BankCustomer implements DebitCardAccount, CreditAccount{
    String NAME_SURNAME = "Memmedova Gunay";
    int customerId = 12345;
    String phoneNumber = "050-555-6778";
    String email = "mgunay@gmail.com";


    public void getInfo(){
        System.out.println("Her full name is "+NAME_SURNAME);
        System.out.println("Her customer id: "+customerId);
        System.out.println("Her number is: "+phoneNumber);
        System.out.println("Her email is: "+email);
    }

    @Override
    // DebitCardAccount
    public void checkBalance() {
        System.out.println("Her debit account is 1000 AZN");
    }

    @Override
    public void addFunds() {
        System.out.println("Add Fund: 2345");
    }

    @Override
    public void removeFunds() {
        System.out.println("Remove Funds : 1500");
    }

    @Override
    //CreditAccount
    public void creditBalance() {
        System.out.println("Her Credit Balance is 3000 AZN");
    }
}
