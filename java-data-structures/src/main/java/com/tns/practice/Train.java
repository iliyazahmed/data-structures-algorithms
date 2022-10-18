package com.tns.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private String trainName;
    private Double price;
    private String source;
    private String destination;
}
