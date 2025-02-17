package com.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
