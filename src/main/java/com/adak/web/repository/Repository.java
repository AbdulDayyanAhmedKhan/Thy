package com.adak.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adak.web.entity.Employee;

public interface Repository extends JpaRepository<Employee, Long> {

}
