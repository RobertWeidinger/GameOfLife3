package gameoflife3;

import static gameoflife3.GoLState.DEAD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class GameOfLifeRule {

    public boolean cellWillLive(int numberOfNeighbours, GoLState a) {
        if (a == DEAD) {
            if (numberOfNeighbours == 3) {
                return true;
            } else {
                return false;
            }
        } else {
            if (numberOfNeighbours == 3 || numberOfNeighbours == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    
}
