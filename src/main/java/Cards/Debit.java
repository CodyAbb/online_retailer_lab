package Cards;

public class Debit extends PaymentCard implements IChargable {

    private double fee;

    public Debit(String accountHolder, String expiryDate, int accountNumber){
        super(accountHolder, expiryDate, accountNumber);
        this.fee = 0.01;
    }

    public double getTransactionFee(){
        return this.fee;
    }
}
