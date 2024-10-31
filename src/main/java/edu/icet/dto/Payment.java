package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {
    private Integer id;
    private LocalDate date;
    private String amount;
    private Integer orderId;
    private String method;
}
