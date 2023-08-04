package edu.gonzaga;

import javax.swing.*;
import java.awt.*;

public class PlayGame {
    JFrame mainWindowFrame;
    JPanel player1Panel;
    JPanel player2Panel;
    Player p1; //player 1 object
    Player p2; //player 2 object

    public PlayGame(){
        player1Panel = new JPanel();
        player2Panel = new JPanel();
        p1 = new Player("P1");
        p2 = new Player("P2");
    }

    public void startGame(){
        //main window startup settings
        this.mainWindowFrame = new JFrame("--------- BATTLESHIP! ---------"); //window title
        this.mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindowFrame.setBackground(Color.white);
        this.mainWindowFrame.setPreferredSize(new Dimension(1400, 800));
        this.mainWindowFrame.setLocation(200,100);
        mainWindowFrame.setVisible(true);
        
        //generate player panels
        player1Panel = genPlayer1Panel();
        player2Panel = genPlayer2Panel();

        //add player panels to the main window
        mainWindowFrame.getContentPane().add(BorderLayout.EAST, player1Panel);
        mainWindowFrame.getContentPane().add(BorderLayout.WEST, player2Panel);

        mainWindowFrame.setLayout(new GridLayout(1, 2));
        mainWindowFrame.pack(); 
    }

    private JPanel genPlayer1Panel(){
        //create and format player display label
        JLabel player1NameLabel = new JLabel("-     Player1     -");
        player1NameLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        player1Panel.setBorder(BorderFactory.createLineBorder(Color.black)); //set panel border color
        player1Panel.add(player1NameLabel); //add player display label
        player1Panel.add(p1.boardPanel); //add boardpanel from local class object
        return player1Panel;
    }

    private JPanel genPlayer2Panel(){
        //create and format player display label
        JLabel player2NameLabel = new JLabel("-     Player2     -");
        player2NameLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        player2Panel.setBorder(BorderFactory.createLineBorder(Color.black)); //set panel border color
        player2Panel.add(player2NameLabel); //add player display label
        player2Panel.add(p2.boardPanel); //add boardpanel from local class object
        return player2Panel;
    }

}


