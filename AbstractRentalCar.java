/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Josh
 */
public abstract class AbstractRentalCar implements RentalCar{
    private String driverName;
    private String make;
    private String model;

    public AbstractRentalCar(String driverName) {
        this.driverName = driverName;
    }

    public AbstractRentalCar(String driverName, String make, String model) {
        this.driverName = driverName;
        this.make = make;
        this.model = model;
    }
  
    @Override
    public String getDriverName() {
        return this.driverName;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }
    
    @Override
    public void describe(){
        System.out.println("I am a " + getMake() +" " + getModel() + ", driven by " + getDriverName() +"\n");
    }
}
    

