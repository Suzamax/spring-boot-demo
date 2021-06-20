package one.suzamax.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
	/*
	 * Lombok adds the getters and setters :-)
         */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String car_make;
    private String car_model;
    private int car_year;
    private String car_vin;
    private int owner_id;
	public String getCar_make() {
		return car_make;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getCar_vin() {
		return car_vin;
	}
	public void setCar_vin(String car_vin) {
		this.car_vin = car_vin;
	}
	public int getCar_year() {
		return car_year;
	}
	public void setCar_year(int car_year) {
		this.car_year = car_year;
	}
	public void setCar_make(String car_make) {
		this.car_make = car_make;
	}
    
}
