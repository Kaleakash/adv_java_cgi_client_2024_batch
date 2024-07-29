package com;

public class CarTest {

	public static void main(String[] args) {
		Car innova = new Car();			// heap memory created...
		Car ertiga = new Car();
		Car santro = new Car(4,650000,"RED");
		innova.start();
		innova.stop();
		innova.carInfo();
		ertiga.carInfo();
		System.out.println("----------------------");
		innova.colour="Gray";
		innova.price=3400000;
		innova.wheel=4;
		innova.carInfo();
		santro.carInfo();
	}

}
