/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife3test;

import gameoflife3.Generation;
import gameoflife3.GoLState;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KORBI
 */
public class GenerationTest {
    
    private Generation gen;
    
    public GenerationTest() {
    }
    
    @Before
    public void setUp() {
        gen = new Generation();
    }
    
    @After
    public void tearDown() {
    }
/*
    @Test
    public void testGenerationRule1() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);
        
        Assert.assertTrue(gen.cellWillLive(1,1));
        Assert.assertTrue(gen.cellWillLive(1,-1));
        Assert.assertFalse(gen.cellWillLive(0,1));
    }
*/
    @Test 
    public void testCellAlive(){
        gen.addLivingCell(1, 1);
        
        Assert.assertTrue(gen.cellAlive(1,1));
    }
    
    @Test
    public void testNumberOfNeighboursAlive() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);
    
        Assert.assertEquals(3, gen.numberOfNeighboursAlive(1,1));
        Assert.assertEquals(3, gen.numberOfNeighboursAlive(1,-1));
        Assert.assertEquals(1, gen.numberOfNeighboursAlive(-1,0));
    }

}
