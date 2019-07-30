package com.hibernate.Store.repositary;

import org.springframework.data.repository.CrudRepository;

import com.hibernate.Store.model.Employee;

public interface EmpRepositary extends CrudRepository<Employee, Integer> {

}
