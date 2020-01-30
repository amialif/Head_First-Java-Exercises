package com.practicehouse.guessgame;

/**
 *
 * @author arifur.rahman
 */
public class Player {
    
    public int number;
    
    public void guess(){
        number = (int) (Math.random() * 10);
    }
    
}
