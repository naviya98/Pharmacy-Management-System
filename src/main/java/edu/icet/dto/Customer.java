package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String nic;
    private String gender;
    private String address;
    private String contact;
    private String email;
}
