package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component					// <bean class="com.Address"></bean>
public class Address {		// by default class name is id consider using camelNaming rules. 
@Value(value = "Bangalore")
private String city;
@Value(value = "Kar")
private String state;
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
