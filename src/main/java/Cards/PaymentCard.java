package Cards;

public abstract class PaymentCard {

    private String accountHolder;
    private String expiryDate;
    private int accountNumber;

    public PaymentCard(String accountHolder, String expiryDate, int accountNumber) {
        this.accountHolder = accountHolder;
        this.expiryDate = expiryDate;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
