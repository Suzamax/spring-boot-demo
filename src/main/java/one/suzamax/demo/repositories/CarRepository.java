package one.suzamax.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.suzamax.demo.models.Car;

@Repository
public interface CarRepository extends JpaRepository <Car, Long> {
    // tutto è buio
}
