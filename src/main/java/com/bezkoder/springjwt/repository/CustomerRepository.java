package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}