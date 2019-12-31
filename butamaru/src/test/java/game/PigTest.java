package game;

import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PigTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void pigAttackTest()
    {
        Pig pigA = new Pig("A", 10, 10, 10, 10);
        Pig pigB = new Pig("B", 8, 8, 8, 8);
        pigA.attack(pigB);
        System.out.println("finish");
        //assertThat(pigB.hitPoint).equalTo(2);

    }
}