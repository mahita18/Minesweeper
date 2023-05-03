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
    
    public Tile(){
        nearbyMines=0;
        button = new JButton();
        mine = false;
    }
     
    public JButton button(){
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (mine)
                    button.setText("X");
                else
                    button.setText(Integer.toString(nearbyMines));
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
