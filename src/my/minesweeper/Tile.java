/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.minesweeper;

import javax.swing.JButton;

/**
 *
 * @author mahit
 */
public class Tile {
    int nearbyMines;
    JButton button;
    
    public Tile(){
        nearbyMines=0;
        button = new JButton(" ? ");
        
    }
    
    public JButton button(){
        return button;
    }
    
    public void addNearbyMine(){
        nearbyMines++;
    }
    
    public int uncover(){
        return nearbyMines;
    }
}
