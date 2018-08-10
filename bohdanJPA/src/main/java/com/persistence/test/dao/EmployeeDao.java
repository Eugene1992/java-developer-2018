package com.persistence.test.dao;


import com.persistence.test.Employee;

import java.util.List;

public interface EmployeeDao extends GenericDao<Integer, Employee> {

    List<Employee> getByName(String name);

    List<Employee> getByPosition(String position);

}
