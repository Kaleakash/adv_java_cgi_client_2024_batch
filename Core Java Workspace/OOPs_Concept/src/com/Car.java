package com;

public class Car {
int wheel;
float price;
String colour;

Car() {
	System.out.println("object created...");
	wheel=4;
	price = 400000;
	colour = "white";
}
Car(int wheel, float price, String colour){
	this.wheel=wheel;
	this.price=price;
	this.colour=colour;
}
void setCarInfo(int wheel, float price, String colour){
	this.wheel=wheel;
	this.price=price;
	this.colour=colour;
}
void start() {
	System.out.println("car start");
}
void appliedGear() {
	System.out.println("appliedGear");
	
}
void moving() {
	System.out.println("car is moving");
}
void stop() {
	System.out.println("car stop");
}
void carInfo() {
	System.out.println("wheel "+wheel);
	System.out.println("colour "+colour);
	System.out.println("price "+price);
}
}
