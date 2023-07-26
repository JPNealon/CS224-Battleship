package edu.gonzaga;

import javax.swing.*;
import java.awt.*;
import java.util.Currency;
import java.util.Scanner;
import java.beans.Transient;
import java.util.ArrayList;

public class Player {
    String name;    //player name
    Board board;    //the players ocean and target boards
    JPanel boardPanel = new JPanel();   //gui panel to represent the players two board grids (ocean and target boards)
    JPanel sidePanel = new JPanel();    //gui panel for players profile side panel (picutre, name, ships, modes, etc)


    public Player(String name){
        this.name = name;
        this.board = new Board(name);
        boardPanel.setLayout(new GridLayout(2,1)); // stack frames on top of each other
        boardPanel.add(board.targetPanel);
        boardPanel.add(board.oceanPanel);
    }
    
    
    //the user is told it is their turn and takeTurn is called
    public void takeTurn(){

        //guessCoordinates();
        board.allShipsSunk();
    }

    //ships are created and the user is able to place them on the board
    // placeholder. We are currently planning to make ship places automatically generated to save time
    public void placeShips(){

    }


}



