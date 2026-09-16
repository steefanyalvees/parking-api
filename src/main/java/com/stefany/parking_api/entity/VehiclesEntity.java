package com.stefany.parking_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "vehicles")
public class VehiclesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id; // uuid id autogenerate
    @Column(name ="model", length = 10)
    private String model;
    @Column(name ="color", length = 7)
    private String color;
    @Column(name ="brand", length = 10)
    private String brand;
    @Column(name ="license_plate", length = 6)
    private String licensePlate;
    @Column(name ="vehicle_type", length = 10)
    private String vehicleType;

}
