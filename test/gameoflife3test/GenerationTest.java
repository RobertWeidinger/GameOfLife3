/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife3test;

import gameoflife3.Generation;
import gameoflife3.GoLState;
import gameoflife3.Koordinate;
import java.util.Set;
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

    @Test
    public void testGenerationRule1() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);
        
        Assert.assertTrue(gen.cellWillLive(1,1));
        Assert.assertTrue(gen.cellWillLive(1,-1));
        
    }
    
    @Test
    public void testGenerationRule2a() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);
       
        Assert.assertFalse(gen.cellWillLive(0,0));
    }

 
    @Test
    public void testGenerationRule2b() {
        gen.addLivingCell(0,0);
       
        Assert.assertFalse(gen.cellWillLive(0,0));
    }

    
    @Test
    public void testGenerationRule3a() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);

        Assert.assertTrue(gen.cellWillLive(1,0));
    }

    @Test
    public void testGenerationRule3b() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(2,0);
        gen.addLivingCell(1,1);

        Assert.assertTrue(gen.cellWillLive(1,1));
    }
    
    @Test
    public void testGenerationRule4() {
        gen.addLivingCell(0,0);
        gen.addLivingCell(1,0);
        gen.addLivingCell(0,2);
        gen.addLivingCell(1,2);
        gen.addLivingCell(0,1);
       
        Assert.assertFalse(gen.cellWillLive(1,1));
    }

 

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

    
    @Test
    public void testLivingCellsAndNeighbours() {
        gen.addLivingCell(1,1);
        gen.addLivingCell(2,2);
        Set<Koordinate> livingCellsAndNeighbours = gen.getLivingCellsAndNeighbours();
/*  soll die folgenden x- und *-Koordinaten zurückliefern:
    
         3   _ * * *
         2   * * x *
         1   * x * *
         0   * * * _
    
             0 1 2 3
    
    wobei die x die lebenden Zellen sind und die * die Nachbarn
*/
        for (int x=0; x<4; x++)
            for (int y=0; y<4; y++) {
                if ((x==0 && y==3) || (x==3 && y==0))
                    Assert.assertFalse(livingCellsAndNeighbours.contains(new Koordinate(x,y)));
                else
                    Assert.assertTrue(livingCellsAndNeighbours.contains(new Koordinate(x,y)));
            }
        Assert.assertEquals(14, livingCellsAndNeighbours.size());
    }                        

    /*
    private void setupXYMinMaxTests() {
        gen.addLivingCell(0, 0);
        gen.addLivingCell(1, 0);
        gen.addLivingCell(1, 1);
    }

    @Test
    public void testGetXMin() {
        setupXYMinMaxTests();
        Assert.assertEquals(0, gen.getXMin());
    }

    @Test
    public void testGetXMax() {
        setupXYMinMaxTests();
        Assert.assertEquals(1, gen.getXMax());
    }

    @Test
    public void testGetYMin() {
        setupXYMinMaxTests();
        Assert.assertEquals(0, gen.getYMin());
    }

    @Test
    public void testGetYMax() {
        setupXYMinMaxTests();
        Assert.assertEquals(1, gen.getYMax());
    }
*/
}
