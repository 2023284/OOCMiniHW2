/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOCMiniHW2;

/**
 *
 * @author user
 */
public class Boat extends Vehicle implements Sailable {
    
    public Boat(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
        numSails = 1;  
    }
    private boolean sailHoisted;
     @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
        System.out.println("Sailboat is landing on the water.");
    }
}
