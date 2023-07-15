package com.prowings.tightcoupling;

public class Traveller {
	
//    Car c = new Car();
//	Bus bus = new Bus();
	Bike bike = new Bike();
	
    public void startJourney() {
    	System.out.println("starting journey!!");
//        c.move();
//        bus.move();
    	bike.move();
    }

}
