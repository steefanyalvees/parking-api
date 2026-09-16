package com.stefany.parking_api.entity;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.id.uuid.UuidGenerator;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "parking")
public class ParkingSpotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "spot_number", length = 100)
    private Integer spotNumber;

    @Column(name = "spot_type", length = 100)
    private String spotType;

    @Column(name = "spot_status", length = 50)
    private String spotStatus;

}
