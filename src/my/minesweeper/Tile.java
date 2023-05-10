/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.minesweeper;

import javax.swing.JButton;
import java.awt.event.*;

/**
 *
 * @author mahit
 */
public class Tile{
    int nearbyMines;
    JButton button;
    boolean mine;
    Play frame;
    static int remaining;
    
    public Tile(int mineNum, Play window){
        frame = window;
        nearbyMines=0;
        button = new JButton();
        mine = false;
        remaining = 36-mineNum;
    }
     
    public JButton buttonListen(){
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (mine){
                    frame.showMessage("Sorry! You uncovered a mine!");
                    frame.dispose();
                }
                
                else if(remaining==1){
                    button.setText(Integer.toString(nearbyMines));
                    frame.showMessage("Congrats! You won the game!");
                    frame.dispose();
                }
                
                else{
                    button.setText(Integer.toString(nearbyMines));
                    button.setEnabled(false);
                    remaining--;
                    
                }
            }
        });
        return button;
    }
    
    public void addNearbyMine(){
        nearbyMines++;
    }
    
    public void setType(){
        
        mine = true;
    }
    
}
