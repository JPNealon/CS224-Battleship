package edu.gonzaga;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coordinate {
    int x;  
    int y;
    boolean hasShip;
    JButton button;

    public Coordinate(int x, int y, JPanel buttonPanel){
        this.x=x;
        this.y=y;
        this.hasShip = false;                   //default coordinate does not have a ship on it
        this.button = new JButton(x + "," + y); //create a button for the coordinate
        this.button.setPreferredSize(new Dimension(60, 60));
        addButtonActionListener();              //add action listener to button 
        buttonPanel.add(this.button);
    }

    private void addButtonActionListener() {
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hasShip == true){
                    System.out.println("HIT");
                    button.setBackground(Color.RED);
                    button.setEnabled(false);
                }
                else{
                    System.out.println("MISS");
                    button.setBackground(Color.GREEN);
                    button.setEnabled(false);
                }
            }
        });
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //mostly a pseudo code to compare coordinates for two player use. 
    public boolean compareCoord(Coordinate coordinate){
        if(coordinate.getX() == this.x && coordinate.getY() == this.y){
            return true;
        }
        return false;
    }

    public String toString(){
        return "\nX=" + x + " and Y=" + y;
    }

}