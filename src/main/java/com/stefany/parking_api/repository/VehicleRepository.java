package com.stefany.parking_api.repository;

import com.stefany.parking_api.entity.VehiclesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<VehiclesEntity,Long>{

    List<VehiclesEntity> findByModel(String model);
    Optional<VehiclesEntity> findById(Long id);
}
