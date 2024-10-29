package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class OrderEntity {
    @Id
    @GeneratedValue(Stratergy = GenerationType.IDENTITY)

    private Integer id;
    private String date;
    private String total;
    private Integer cusId;
    private Integer paharmacistId;
    private String Status;
}