/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class RentalCarAgency {

    public ArrayList<RentalCar> carList = new ArrayList<RentalCar>();
    
    public static void main(String[] args) {
        RentalCarAgency agency = new RentalCarAgency();
	RentalCar a = agency.rentNewCar("Ava");
	a.describe();
	RentalCar b = agency.rentNewCar("Bella");
	b.describe();
}
    
        public RentalCar rentNewCar(String name){
        Random r = new Random();
          int x = Math.abs(r.nextInt() % 3);
        switch (x) {
            case 0:
                RentalCar Toyato = new ToyotaCorolla(name);
                return Toyato;
            case 1:
                RentalCar Honda = new HondaAccord(name);
                return Honda;
            default:
                RentalCar Ford = new FordMustang(name);
                return Ford;  
        }
}
