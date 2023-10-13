/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOCMiniHW2;

/**
 *
 * @author sweis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
          public static void main(String[] args) {
        Boat boat = new Boat(12, "Airbus", "Sailboat", 3);
        Aeroplane airplane = new Aeroplane(580, "AirLingus", "Jet", 260);
        MotorCar car = new MotorCar(100, "Toyota ", "Mark X", 4);

        boat.hoistSail();
        boat.landHo();

        airplane.changeAltitude(25000);
        System.out.println("Current Altitude: " + airplane.getAltitude());

        car.accelerate(60);
        System.out.println("Current Speed: " + car.getSpeed());  
      
}
}






    
