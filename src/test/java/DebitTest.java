import Cards.Debit;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DebitTest {
    private Debit debitCard;

    @Before
    public void before(){
        debitCard = new Debit("Jamie", "07/43", 975362);
    }

    @Test
    public void canGetAccountHolderName(){
        assertEquals("Jamie", debitCard.getAccountHolder());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("07/43", debitCard.getExpiryDate());
    }

    @Test
    public void canGetAccountNumber(){
        assertEquals(975362, debitCard.getAccountNumber());
    }

    @Test
    public void canGetTransactionFee(){
        assertEquals(0.01, debitCard.getTransactionFee());
    }
}
