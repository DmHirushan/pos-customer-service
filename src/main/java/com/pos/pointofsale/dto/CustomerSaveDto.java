package com.pos.pointofsale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerSaveDto {
    private String name;
    private String address;
    private String telPhone;
}
