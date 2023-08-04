/*
 * Final project main driver class
 * 
 * Contributors:
 *   - Jack Nealon
 * 
 * Copyright: 2023
 */
package edu.gonzaga;

public class Battleship {
    public static void main(String[] args){
        //Battleship battleApp = new Battleship();
        //battleApp.runGUI();
        PlayGame run = new PlayGame();
        run.startGame();
    }
}