import org.junit.Before;
import org.junit.Test;
import treasures.Gold;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    Gold gold;

    @Before
    public void before(){
        gold = new Gold(100, "Rare");
    }

    @Test
    public void canGetValue(){
        assertEquals(100, gold.getValue());
    }


}
