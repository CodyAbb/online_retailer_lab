import Cards.IChargable;

import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<IChargable> cards;

    public ReportingSoftware(){
        this.cards = new ArrayList<IChargable>();
    }

    public void addCard(IChargable card){
        this.cards.add(card);
    }

    public int cardCount(){
        return this.cards.size();
    }
//
//    public double transactionTotal(int amount){
//
//    }
}
