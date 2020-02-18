import Cards.Credit;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CreditTest {

    private Credit creditCard;

    @Before
    public void before(){
        creditCard = new Credit("Tony", "12/25", 746352);
    }

    @Test
    public void canGetAccountHolderName(){
        assertEquals("Tony", creditCard.getAccountHolder());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("12/25", creditCard.getExpiryDate());
    }

    @Test
    public void canGetAccountNumber(){
        assertEquals(746352, creditCard.getAccountNumber());
    }
}
