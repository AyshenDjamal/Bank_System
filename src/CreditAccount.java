public interface CreditAccount {
    double creditLimit = 1000;
    int loyaltyPoints = 250;

    void creditBalance();

    static void creditLimit(){
        System.out.println("Her credit limit is "+creditLimit);
    }

    default void loyaltyPoints(){
        System.out.println("She has "+loyaltyPoints+" points");
    }
}
