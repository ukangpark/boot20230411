package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {

	@Select(""" 
			<script>
			<bind name="pattern" value="'%' + keyword + '%'"/>
			SELECT 
				customerId id,
				customerName name,
				contactName,
				address
			FROM
				Customers
			WHERE
				CustomerName LIKE #{pattern} 
			ORDER BY id DESC
			</script>
			""")
	List<Customer> sql1(String keyword);

	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'"/>
			SELECT
				employeeId id,
				lastName,
				firstName
			FROM Employees
			WHERE lastName LIKE #{pattern}
					OR firstName LIKE #{pattern}
			</script>
			""")
	List<Employee> sql2(String keyword);

}
