package com.stefany.parking_api.repository;

import com.stefany.parking_api.entity.ParkingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSessionRepository extends JpaRepository<ParkingSessionEntity, Long> {
}
