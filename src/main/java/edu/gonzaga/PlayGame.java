package edu.gonzaga;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PlayGame {
    JFrame mainWindowFrame;
    JPanel mainPanel;
    JPanel player1Panel;
    JPanel boardPanel;
    Board board1;

    public void startGame(){
        this.mainWindowFrame = new JFrame("---------BATTLESHIP!---------");
        //MainFrame.getContentPane().setPreferredSize(new Dimension(100, 200));
        this.mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindowFrame.setBackground(Color.white);
        this.mainWindowFrame.setPreferredSize(new Dimension(700, 900));
        this.mainWindowFrame.setLocation(500,100);
        //setSize(new Dimension(100, 200));
        // this.setLocationByPlatform(true);
        mainPanel = new JPanel();

        Player p1 = new Player("P1");

        JLabel player1NameLabel = new JLabel("-     Player1     -");
        player1NameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        // player1Panel.add(player1NameLabel);
        // player1Panel.setBorder(BorderFactory.createLineBorder(Color.black));

        // boardPanel = new JPanel();
        // boardPanel.add(p1.boardPanel);
        // boardPanel.setPreferredSize(new Dimension(10, 10));
        //boardPanel.setPreferredSize(new Dimension(10, 10));

        mainPanel.add(player1NameLabel);
        mainPanel.add(p1.boardPanel);
        //mainPanel.setLayout(new GridLayout(2, 1));

        // mainWindowFrame.getContentPane().add(BorderLayout.NORTH, player1Panel);
        // mainWindowFrame.getContentPane().add(BorderLayout.CENTER, boardPanel);
        // mainWindowFrame.add(player1Panel);
        // mainWindowFrame.add(boardPanel);
        mainWindowFrame.add(mainPanel);
        //mainWindowFrame.setLayout(new GridLayout(2, 1));
        mainWindowFrame.pack(); 
        mainWindowFrame.setVisible(true);
    }

    private JPanel genPlayer1Panel(){
        JPanel newP1Panel = new JPanel();
        //newP1Panel.setPreferredSize(new Dimension(50, 50));
        // newP1Panel.setBorder(BorderFactory.createLineBorder(Color.black));

        //JPanel name1Panel = new JPanel();
        JLabel player1NameLabel = new JLabel("-     Player1     -");
        //name1Panel.add(player1NameLabel);

        // JPanel board1Panel = new JPanel();
        // this.board1Container = new JPanel();
        // this.board1Container.setSize(100,100);
        // this.board1Container.setBackground(Color.blue);
        // board1Panel.add(board1Container);

        newP1Panel.add(player1NameLabel);
        //newP1Panel.add(board1Panel);

        //newP1Panel.setLayout(new GridLayout(2, 1));
        return newP1Panel;
    }

}


