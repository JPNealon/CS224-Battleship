package edu.gonzaga;

import javax.swing.*;
import java.awt.*;

public class PlayGame {
    JFrame mainWindowFrame;
    JPanel player1Panel;
    JPanel player2Panel;
    Player p1;
    Player p2;

    public PlayGame(){
        player1Panel = new JPanel();
        player2Panel = new JPanel();
        p1 = new Player("P1");
        p2 = new Player("P2");
    }

    public void startGame(){
        this.mainWindowFrame = new JFrame("--------- BATTLESHIP! ---------");
        this.mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindowFrame.setBackground(Color.white);
        this.mainWindowFrame.setPreferredSize(new Dimension(1400, 800));
        this.mainWindowFrame.setLocation(200,100);
        
        player1Panel = genPlayer1Panel();
        player2Panel = genPlayer2Panel();

        mainWindowFrame.getContentPane().add(BorderLayout.EAST, player1Panel);
        mainWindowFrame.getContentPane().add(BorderLayout.WEST, player2Panel);

        mainWindowFrame.setLayout(new GridLayout(1, 2));
        mainWindowFrame.pack(); 
        mainWindowFrame.setVisible(true);
    }

    private JPanel genPlayer1Panel(){
        JLabel player1NameLabel = new JLabel("-     Player1     -");
        player1NameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        player1Panel.setBorder(BorderFactory.createLineBorder(Color.black));
        player1Panel.add(player1NameLabel);
        player1Panel.add(p1.boardPanel);
        return player1Panel;
    }

    private JPanel genPlayer2Panel(){
        JLabel player2NameLabel = new JLabel("-     Player2     -");
        player2NameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        player2Panel.setBorder(BorderFactory.createLineBorder(Color.black));
        player2Panel.add(player2NameLabel);
        player2Panel.add(p2.boardPanel);
        return player2Panel;
    }

}


