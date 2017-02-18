package gameoflife3;

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

    public boolean cellWillLive(int numberOfNeighbours, GoLState goLState) {
        if (numberOfNeighbours == 3){
            return true;
        }
        else {
        return false;
        }
    }
    
}
