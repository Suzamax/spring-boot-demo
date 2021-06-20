package one.suzamax.demo.models;

import javax.persistence.Column;
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
    @Column(name = "car_make")
    private String carMake;
    @Column(name = "car_model")
    private String carModel;
    @Column(name = "car_year")
    private int carYear;
    @Column(name = "car_vin")
    private String carVin;
    @Column(name = "owner_id")
    private int ownerId;
    
}
