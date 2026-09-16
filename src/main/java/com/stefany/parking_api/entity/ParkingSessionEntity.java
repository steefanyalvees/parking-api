package com.stefany.parking_api.entity;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="session")
public class ParkingSessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "ticket_number")
    private Integer ticketNumber;

    @Column(name="vehicle_id", length = 100)
    private Long vehicleId;

    @Column(name = "parking_spot_id")
    private Long parkingSpotId;

    @Column(name="entry_time")
    private LocalDateTime entryTime;

    @Column(name = "exit_time")
    private LocalDateTime exitTime;

    @Column(name = "amount")
    private Long amount;




}
