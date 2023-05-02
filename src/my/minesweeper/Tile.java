/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.minesweeper;

/**
 *
 * @author mahit
 */
public class Tile {
    int nearbyMines;
    
    public Tile(){
        nearbyMines=0;
    }
    
    public void addNearbyMine(){
        nearbyMines++;
    }
    
    public int uncover(){
        return nearbyMines;
    }
}
