package com.pos.pointofsale.service.impl;

import com.pos.pointofsale.dto.CustomerResponseDto;
import com.pos.pointofsale.dto.CustomerSaveDto;
import com.pos.pointofsale.entity.Customer;
import com.pos.pointofsale.repository.CustomerRepository;
import com.pos.pointofsale.service.CustomerService;
import com.pos.pointofsale.util.Mapping;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final Mapping mapper;

    @Override
        public void save(CustomerSaveDto customerDto) {
            Customer savedCustomer = repository.save(mapper.convertToEntity(customerDto, Customer.class));
        }

    @Override
    public CustomerResponseDto getById(int id) {
        return mapper.convertToDto(repository.findById(id), CustomerResponseDto.class);
    }

    @Override
    public List<CustomerResponseDto> getAll() {
        return mapper.convertToDto(repository.findAll(), CustomerResponseDto.class);
    }

    @Override
    public void update(CustomerSaveDto customerDto, int id) {
        Optional<Customer> customer = repository.findById(id);
        customer.get().setName(customerDto.getName());
        customer.get().setAddress(customerDto.getAddress());
        customer.get().setTelPhone(customerDto.getTelPhone());
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
