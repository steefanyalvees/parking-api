package com.stefany.parking_api.repository;

import com.stefany.parking_api.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carRepository extends JpaRepository<Car,Long>{
}
