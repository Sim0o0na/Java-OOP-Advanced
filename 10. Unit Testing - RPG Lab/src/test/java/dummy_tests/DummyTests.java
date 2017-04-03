package dummy_tests;

import org.junit.Assert;
import org.junit.Test;
import rpglab.Dummy;

/**
 * Created by Sim0o on 3/30/2017.
 */
public class DummyTests {
    @Test
    public void losehealthWhenAttacked(){
        Dummy dummy = new Dummy(10, 10);
        dummy.takeAttack(10);
        Assert.assertTrue(dummy.isDead());
    }

    @Test(expected = IllegalStateException.class)
    public void attackDeadDummyThrowException(){
        Dummy dummy = new Dummy(0, 0);
        dummy.takeAttack(10);
    }

    @Test
    public void deadDummyGivesXP(){
        Dummy dummy = new Dummy(0, 10);
        dummy.giveExperience();
    }
    @Test(expected = IllegalStateException.class)
    public void aliveDummyGivesXP(){
        Dummy dummy = new Dummy(10, 0);
        dummy.giveExperience();
    }
}
