public interface DebitCardAccount {
    void checkBalance();

    void addFunds();

    void removeFunds();

    static void accountStatus(){
        System.out.println("Her status is active");
    }
}
