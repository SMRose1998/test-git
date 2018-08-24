/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author SMRos
 */
public class Dice {
    public static void main(String[] args) {
        
        //Set number of rolls
        final int numberOfRolls = 5;
        
        //Number of types of die to choose from
        final int numberOfDie = 7;
        
        //Instantiate array of dice
        Die[] dieArray = new Die[numberOfDie];
        
        //Fill array of dice
        dieArray[0] = new Die(4);
        dieArray[1] = new Die(6);
        dieArray[2] = new Die(8);
        dieArray[3] = new Die(10);
        dieArray[4] = new Die(12);
        dieArray[5] = new Die(20);
        dieArray[6] = new Die(100);
        
        Die currentDie;
        int randDieId;
        for(int i = 0;i<numberOfRolls;i++){
            randDieId = (int)(Math.random()*numberOfDie);
            currentDie = dieArray[randDieId];
            currentDie.roll();
            System.out.print(currentDie.toString());
            if(i!=numberOfRolls-1)
                System.out.print(", ");
            else
                System.out.println();
             
        }
        
        
        
        
        
    }    
}