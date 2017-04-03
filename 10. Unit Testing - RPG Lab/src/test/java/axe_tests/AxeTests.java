package axe_tests;

import org.junit.Assert;
import org.junit.Test;
import rpglab.Axe;
import rpglab.Dummy;

import java.awt.*;

/**
 * Created by Sim0o on 3/30/2017.
 */
public class AxeTests {

    @Test
    public void axeDurability(){
        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(10,10);
        axe.attack(dummy);
        Assert.assertTrue(axe.getDurabilityPoints()==9);
    }

    @Test(expected = IllegalStateException.class)
    public void brokenAxeAttack(){
        Axe axe = new Axe(10,0);
        Dummy dummy = new Dummy(10,10);
        axe.attack(dummy);
    }
}
