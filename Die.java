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
public class Die {
    final int SIDES;
    int current_face = -1;

    public Die(int n) {
        this.SIDES = n;
    }

    public int roll(){
        current_face = (int)(Math.random()*SIDES)+1;
        return current_face;
    }

    public int getNumFaces() {
        return SIDES;
    }

    public int getFaceValue() {
        return current_face;
    }

    public String toString(){
        return "d"+SIDES+" = "+current_face;
    }
}
