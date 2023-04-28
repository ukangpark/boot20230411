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

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			
			<if test="false">
			WHERE CustomerID = 10
			</if>
			</script>
			""")
	Integer sql3();
	
	@Select("""
			<script>
			
			SELECT COUNT(*)
			FROM Customers
			
			<if test="keyword neq null">
				<bind name="pattern" value="'%' + keyword + '%'"/>
				WHERE CustomerName LIKE #{pattern}
			</if>
			
			</script>
			""")
	Integer sql4(String keyword);

	@Select("""
			<script>
			SELECT AVG(Price)
			FROM Products
			<if test="cid neq 0">
			WHERE CategoryID = #{cid}
			</if>
			</script>
			""")
	Double sql5(int cid);

}
