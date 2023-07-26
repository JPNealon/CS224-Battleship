package edu.gonzaga;

import java.util.Random;

public class Ship{

    public Integer shipSize;
    public Integer shipHealth;
    public Coordinate[] shipCoordinates;
    public boolean isSunk;
    public Integer initX;
    public Integer initY;
    public Integer directionInt;
    public String direction;

    public Ship(Integer size){
        this.shipSize = size;
        this.shipHealth = size;
        this.isSunk = false;
        shipCoordinates = new Coordinate[5];
        generateRandomSpot(shipSize);
    }

    public void generateRandomSpot(Integer shipSize){
        Random rand = new Random();
        directionInt = rand.nextInt(2);

        if(directionInt == 0){
            direction = "horizontal";
        }
        else if(directionInt == 1){
            direction = "vertical";
        }

        if(shipSize == 5 && direction == "horizontal"){
            initX = rand.nextInt(5);
            initY = rand.nextInt(9);
        }

        if(shipSize == 5 && direction == "vertical"){
            initX = rand.nextInt(9);
            initY = rand.nextInt(5);
        }

        if(shipSize == 4 && direction == "horizontal"){
            initX = rand.nextInt(6);
            initY = rand.nextInt(9);
        }

        if(shipSize == 4 && direction == "vertical"){
            initX = rand.nextInt(9);
            initY = rand.nextInt(6);
        }

        if(shipSize == 3 && direction == "horizontal"){
            initX = rand.nextInt(7);
            initY = rand.nextInt(9);
        }

        if(shipSize == 3 && direction == "vertical"){
            initX = rand.nextInt(9);
            initY = rand.nextInt(7);
        }

        if(shipSize == 2 && direction == "horizontal"){
            initX = rand.nextInt(8);
            initY = rand.nextInt(9);
        }

        if(shipSize == 2 && direction == "vertical"){
            initX = rand.nextInt(9);
            initY = rand.nextInt(8);
        }
        
    }

    public void assignShipLocations(Integer size, Integer xPos, Integer yPos){
        for(int i = 0; i < size; i++){
            shipCoordinates[i] = new Coordinate(xPos + i, yPos, null);
        }
    }

    public void sunkStatus(){
        if(shipHealth == 0){

            isSunk = true;

        }

    }

}

