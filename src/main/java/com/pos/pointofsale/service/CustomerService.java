package com.pos.pointofsale.service;

import com.pos.pointofsale.dto.CustomerResponseDto;
import com.pos.pointofsale.dto.CustomerSaveDto;
import com.pos.pointofsale.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {
    void save(CustomerSaveDto customerDto);
    CustomerResponseDto getById(int id);
    List<CustomerResponseDto> getAll();
    void update(CustomerSaveDto customerDto, int id);
    void delete(int id);
}
