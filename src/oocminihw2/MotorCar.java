/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOCMiniHW2;

/**
 *
 * @author user
 */
public class MotorCar extends Vehicle implements Driveable {
    
    public MotorCar(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
        numWheels = 4;
    }
  @Override
    public void accelerate(float speed) {
        setSpeed(getSpeed() + speed);
    }

    @Override
    public void brake() {
        setSpeed(0);
    }

    @Override
    public void turn(float angle) {
        setDirection(getDirection() + angle);
    } 
}
