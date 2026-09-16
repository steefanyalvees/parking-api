package com.stefany.parking_api.repository;

import com.stefany.parking_api.entity.VehiclesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<VehiclesEntity,Long>{
}
