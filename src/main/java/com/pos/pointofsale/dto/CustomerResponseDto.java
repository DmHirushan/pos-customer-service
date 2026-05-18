package com.pos.pointofsale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerResponseDto {
    private int id;
    private String name;
    private String address;
    private String telPhone;
}
