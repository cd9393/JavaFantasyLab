import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe("Bronze axe", 5);
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(5, axe.getAttackDamage());
    }
}
