package edu.gonzaga;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class Board{
    String name;
    JPanel targetPanel = new JPanel();  //panel to hold the target grid 
    JPanel oceanPanel = new JPanel();   //panel to hold the ocean grid
    Coordinate[] targetArr = new Coordinate[100];   //array to hold coordinate objects (TARGET GRID)
    Coordinate[] oceanArr = new Coordinate[100];    //array to hold coordinate objects (OCEAN GRID)

    //create ship objects and live-ship counter
    Integer numShips = 5;
    Ship carrier = new Ship(5);
    Ship battleship = new Ship(4);
    Ship cruiser = new Ship(3);
    Ship submarine = new Ship(3);
    Ship destroyer = new Ship(2);

    public int hitCounter = 0;
    public int missCounter = 0;
    
    public Board(String name){
        this.name = name;
        makeBoard(targetArr, targetPanel);  //generate board
        //makeBoard(oceanArr, oceanPanel);    //generate board
    }

    public void makeBoard(Coordinate[] boardArr, JPanel panel){
        JPanel buttonPanel = new JPanel(); //panel to hold all 100 buttons

        buttonPanel.setLayout(new GridLayout(10,10)); //make it 10 x 10 
        int count = 0;
        for (int y = 0; y < 10; y++){
            for (int x = 0; x < 10; x++){
                boardArr[count] = new Coordinate(x, y, buttonPanel);    //add coordinate to board coordinate array
                boardArr[count].button.setBackground(Color.blue);       //set default color to blue for ocean

                if (carrier.direction == "vertical"){
                    addVerticalShipParts(x, y, boardArr, count);
                }
                if(carrier.direction == "horizontal"){
                    addHorizontalShipParts(x, y, boardArr, count);
                }

                if (battleship.direction == "vertical"){
                    addVerticalShipParts(x, y, boardArr, count);
                }
                if(battleship.direction == "horizontal"){
                    addHorizontalShipParts(x, y, boardArr, count);
                }

                if (cruiser.direction == "vertical"){
                    addVerticalShipParts(x, y, boardArr, count);
                }
                if(cruiser.direction == "horizontal"){
                    addHorizontalShipParts(x, y, boardArr, count);
                }

                if (submarine.direction == "vertical"){
                    addVerticalShipParts(x, y, boardArr, count);
                }
                if(submarine.direction == "horizontal"){
                    addHorizontalShipParts(x, y, boardArr, count);
                }

                if (destroyer.direction == "vertical"){
                    addVerticalShipParts(x, y, boardArr, count);
                }
                if(destroyer.direction == "horizontal"){
                    addHorizontalShipParts(x, y, boardArr, count);
                }

                count++;
               
            }
        }

        panel.add(buttonPanel);

    }

    private void addVerticalShipParts(int x, int y, Coordinate[] boardArr, int count){

        if (carrier.direction == "vertical"){

            for(int i = 0; i <= 4; i++){

                if (carrier.initX == x && (carrier.initY + i) == y){
    
                    carrier.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship
    
                }
    
            }
    
        }

        if(battleship.direction == "vertical"){

            for(int i = 0; i <= 3; i++){

                if (battleship.initX == x && (battleship.initY + i) == y){

                    battleship.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(cruiser.direction == "vertical"){

            for(int i = 0; i <= 2; i++){

                if (cruiser.initX == x && (cruiser.initY + i) == y){

                    cruiser.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(submarine.direction == "vertical"){

            for(int i = 0; i <= 2; i++){

                if (submarine.initX == x && (submarine.initY + i) == y){

                    submarine.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(destroyer.direction == "vertical"){

            for(int i = 0; i <= 1; i++){

                if (destroyer.initX == x && (destroyer.initY + i) == y){

                    destroyer.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

    }

    private void addHorizontalShipParts(int x, int y, Coordinate[] boardArr, int count){
       
        if(carrier.direction == "horizontal"){

            for(int i = 0; i <= 4; i++){

                if ((carrier.initX + i) == x && carrier.initY == y){

                    carrier.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(battleship.direction == "horizontal"){

            for(int i = 0; i <= 3; i++){

                if ((battleship.initX + i) == x && battleship.initY == y){

                    battleship.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(cruiser.direction == "horizontal"){

            for(int i = 0; i <= 2; i++){

                if ((cruiser.initX + i) == x && cruiser.initY == y){

                    cruiser.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(submarine.direction == "horizontal"){

            for(int i = 0; i <= 2; i++){

                if ((submarine.initX + i) == x && submarine.initY == y){

                    submarine.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

        if(destroyer.direction == "horizontal"){

            for(int i = 0; i <= 1; i++){

                if ((destroyer.initX + i) == x && destroyer.initY == y){

                    destroyer.shipCoordinates[i] = boardArr[count];       //add coordinate to shipCoordinates array
                    boardArr[count].hasShip = true;                     //tell coordinate it has a ship on it 
                    boardArr[count].button.setBackground(Color.blue);   //set button to blue to represent ship

                }

            }

        }

    }

    //checks to see if the player still has ships
    public Boolean allShipsSunk(){
        if(numShips == 0){
            return true;
        }
        return false;
    }
}
