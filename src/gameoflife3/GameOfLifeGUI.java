/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife3;

import java.awt.Component;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; 
/**
 *
 * @author Robert
 */
public class GameOfLifeGUI {
    private JFrame frame;
    private JTextArea textArea;
    private JScrollPane scrollPane;
   
    public GameOfLifeGUI() {
        frame = new JFrame("Swing Game of Life");
        textArea = new JTextArea(50, 20);
        scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
    }
    
    private void createAndShowGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        Component textArea_ = frame.getContentPane().add(scrollPane);
        textArea.setText("Start");
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
       GameOfLifeGUI gol = new GameOfLifeGUI();
       gol.createAndShowGUI();
       
        for (int i = 0; i < 1000; i++) {
            String text = new String();
            for (int j = 0; j < i; j++) {
                text += j;
                if (j % 50 == 0) {
                    text += System.getProperty("line.separator");
                }
            }
            gol.textArea.setText(text);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameOfLifeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
       

     private static void SystemOutPrintln(String s){
         //System.out.println(s);
     }
}
