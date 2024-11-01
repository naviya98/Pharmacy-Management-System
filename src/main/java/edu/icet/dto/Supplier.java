package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Supplier {
    private Integer supplierId;
    private String name;
    private String address;
    private String contact;
    private String email;
}
