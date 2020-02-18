import Cards.Loyalty;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LoyaltyTest {

    private Loyalty loyaltyCard;

    @Before
    public void before(){
        loyaltyCard = new Loyalty("Jamie", "07/43", 975362);
    }

    @Test
    public void canGetAccountHolderName(){
        assertEquals("Jamie", loyaltyCard.getAccountHolder());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("07/43", loyaltyCard.getExpiryDate());
    }

    @Test
    public void canGetAccountNumber(){
        assertEquals(975362, loyaltyCard.getAccountNumber());
    }
}
