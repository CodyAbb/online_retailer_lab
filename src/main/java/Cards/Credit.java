package Cards;

public class Credit extends PaymentCard implements IChargable{

    private double fee;
    private double riskMultiplier;

    public Credit(String accountHolder, String expiryDate, int accountNumber, double riskMultiplier){
        super(accountHolder, expiryDate, accountNumber);
        this.fee = 0.02;
        this.riskMultiplier = riskMultiplier;
    }

    public double getTransactionFee(){
        return this.fee * this.riskMultiplier;
    }

}
