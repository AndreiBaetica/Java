package com.AIS.Application1;

public class Car extends Machine{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped.");
	}

	public void wipeWindShield(){
		System.out.println("Wiping windshield.");
	}

}
