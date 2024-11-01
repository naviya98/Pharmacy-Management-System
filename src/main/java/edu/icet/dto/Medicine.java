package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Medicine {
    private Integer medicineId;
    private String name;
    private String description;
    private String stockQty;
    private String price;
    private Integer supplierId;
    private String expireDate;
    private String batchNumber;
}
