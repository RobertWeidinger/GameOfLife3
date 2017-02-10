package gameoflife3test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gameoflife3.GoLState;
import gameoflife3.GameOfLifeRule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Robert
 */
public class GameOfLifeRulesTest {
    
    private GameOfLifeRule gameOfLifeRule ;    
    
    public GameOfLifeRulesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        gameOfLifeRule = new GameOfLifeRule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGameOfLifeRule1() {
        for (int numberOfNeighbours=0; numberOfNeighbours<100; numberOfNeighbours++) {
            if (numberOfNeighbours==3)
                Assert.assertTrue(gameOfLifeRule.cellWillLive(numberOfNeighbours,GoLState.DEAD));
            else
                Assert.assertFalse(gameOfLifeRule.cellWillLive(numberOfNeighbours,GoLState.DEAD));
        }
     }

}
