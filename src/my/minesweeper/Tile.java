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
public class Tile {
    int nearbyMines;
    JButton button;
    String type;
    
    public Tile(){
        nearbyMines=0;
        button = new JButton(" ? ");
        type = "normal";
    }
     
    public JButton button(){
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (type.equals("normal"))
                    button.setText(Integer.toString(nearbyMines));
                else
                    button.setText("!");
            }
        });
        return button;
    }
    
    public void addNearbyMine(){
        nearbyMines++;
    }
    
}
