package com.SpringBoot.AddressService.repository;

import com.SpringBoot.AddressService.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
     @Query( nativeQuery = true,value="SELECT a.id, a.city, a.lane1, a.lane2, a.state, a.zip, a.emp_id FROM Address a JOIN Employee e ON e.emp_id = a.emp_id WHERE a.emp_id =:empId")
   Address findByEmpId(@Param("empId") int empId);
}
