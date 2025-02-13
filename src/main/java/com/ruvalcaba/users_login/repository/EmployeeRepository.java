package com.ruvalcaba.users_login.repository;

import com.ruvalcaba.users_login.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
