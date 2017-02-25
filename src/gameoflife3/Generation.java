/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife3;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author KORBI
 */
public class Generation {

    public Generation() {
        cellList = new ArrayList<>();
    }
    
    private ArrayList<Koordinate> cellList;
    

    public void addLivingCell(int x, int y) {
        Koordinate k = new Koordinate(x,y);
        cellList.add(k);
    }
    
    public boolean cellAlive(int x, int y){
        Koordinate k = new Koordinate(x,y);
        return cellList.contains(k);   
    }

    public int numberOfNeighboursAlive(int x, int y) {
        int z = 0;
        int xMax = x+1;
        int yMax = y+1;
        for(int xKor = x-1; xKor <= xMax; xKor++){
            for (int yKor = y-1; yKor <= yMax; yKor++){
            if (xKor == x && yKor == y) continue;
            else if (cellAlive(xKor, yKor)){
                z++;
            }
        }
        }
    return z;
    }
    public boolean cellWillLive(int x, int y){
        Koordinate k = new Koordinate(x, y);
        if (numberOfNeighboursAlive(x,y) <= 1){
            return false;
        }
        if (numberOfNeighboursAlive(x,y) >= 4){
            return false; 
        }
        else return true;
    }

    public Set<Koordinate> getLivingCellsAndNeighbours() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
