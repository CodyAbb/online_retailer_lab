package Cards;

public class Loyalty extends PaymentCard implements IChargable{

    private double fee;

    public Loyalty(String accountHolder, String expiryDate, int accountNumber) {
        super(accountHolder, expiryDate, accountNumber);
        this.fee = 0.00;
    }

    public double getTransactionFee(){
        return this.fee;
    }
}
