import Cards.Credit;
import Cards.Debit;
import Cards.IChargable;
import Cards.Loyalty;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReportingSoftwareTest {

    Debit debitCard;
    Credit creditCard;
    Loyalty loyaltyCard;
    ReportingSoftware reportingSoftware;


    @Before
    public void before(){
        debitCard = new Debit("Olivia", "06/27", 823012);
        creditCard = new Credit("Ross", "08/32", 965423, 5.00);
        loyaltyCard = new Loyalty("Silvia", "09/23", 897521);
        reportingSoftware = new ReportingSoftware();
        reportingSoftware.addCard(debitCard);
        reportingSoftware.addCard(creditCard);
        reportingSoftware.addCard(loyaltyCard);
    }

    @Test
    public void arrayShouldBeEmpty(){
        assertEquals(3, reportingSoftware.cardCount());
    }

    @Test
    public void getTransactionFeeOfDebitCard(){
        assertEquals(0.01, debitCard.getTransactionFee());
    }



}
