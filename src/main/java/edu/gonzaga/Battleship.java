/*
 * Final project main driver class
 * 
 * 
 * Project Description:
 *  - Battleship
 * 
 * Contributors:
 *   - Ryder Gallagher
 *   - Rebekah Blazer
 *   - Jack Nealon
 * 
 * Copyright: 2023
 */
package edu.gonzaga;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battleship {
    public static void main(String[] args){
        //Battleship battleApp = new Battleship();
        //battleApp.runGUI();
        PlayGame run = new PlayGame();
        run.startGame();
    }
/*
    JFrame mainWindowFrame;
    JPanel player1Panel;
    JPanel player2Panel;
    JPanel board1Container;
    JPanel board2Container;
    // Board board1;
    // Board board2;

    void setupGUI(){

        this.mainWindowFrame = new JFrame("---------BATTLESHIP!---------");
        this.mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindowFrame.setBackground(Color.white);
        this.mainWindowFrame.setSize(500, 500);
        this.mainWindowFrame.setLocation(100,100);

        this.player1Panel = new JPanel();
        this.player2Panel = new JPanel();

        this.player1Panel = genPlayer1Panel();
        this.player2Panel = genPlayer2Panel();

        mainWindowFrame.getContentPane().add(BorderLayout.WEST, player1Panel);
        mainWindowFrame.getContentPane().add(BorderLayout.CENTER, player2Panel);
        mainWindowFrame.setLayout(new GridLayout(1, 2));
        mainWindowFrame.pack();
    }

    private JPanel genPlayer1Panel(){
        JPanel newP1Panel = new JPanel();
        newP1Panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel name1Panel = new JPanel();
        JLabel player1NameLabel = new JLabel("-     Player1     -");
        name1Panel.add(player1NameLabel);

        JPanel board1Panel = new JPanel();
        this.board1Container = new JPanel();
        this.board1Container.setSize(100,100);
        this.board1Container.setBackground(Color.blue);
        board1Panel.add(board1Container);

        newP1Panel.add(name1Panel);
        newP1Panel.add(board1Panel);

        newP1Panel.setLayout(new GridLayout(2, 1));
        return newP1Panel;
    }

    private JPanel genPlayer2Panel(){
        JPanel newP2Panel = new JPanel();
        newP2Panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel name2Panel = new JPanel();
        JLabel player2NameLabel = new JLabel("-     Player2     -");
        name2Panel.add(player2NameLabel);

        JPanel board2Panel = new JPanel();
        this.board2Container = new JPanel();
        this.board2Container.setSize(100,100);
        this.board2Container.setBackground(Color.blue);
        board2Panel.add(board2Container);

        newP2Panel.add(name2Panel);
        newP2Panel.add(board2Panel);

        newP2Panel.setLayout(new GridLayout(2, 1));
        return newP2Panel;
    }

    void runGUI(){
        System.out.println("Starting GUI app");
        setupGUI();

        mainWindowFrame.setVisible(true);
        System.out.println("Done in GUI app");
    }
*/
}