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

public class PharmacistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pharmacistId;
    private String name;
    private String licenNumber;
    private String contact;
}
