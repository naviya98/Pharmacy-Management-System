package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Prescription {
    private Integer id;
    private String issueDate;
    private String expireData;
    private String doctorName;
    private Integer cusId;
}
