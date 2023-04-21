package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface mapper05 {

	@Update("""
			UPDATE MyTable39
			SET
			 	col2 = '수정된 값',
			 	col3 = 9999
			""")
	int sql1();
	
	@Update("""
			UPDATE MyTable39
			SET
				col2 = #{val1},
				col3 = #{val2}
			WHERE
				col1 = #{key}
			""")
	int sql2(Integer key, String val1, Integer val2);
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{name},
				Country = #{country}
			WHERE
				CustomerID = #{id}
			""")
	int sql3(Integer id, String name, String country);
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{name},
				ContactName = #{contactName},
				Address = #{address},
				City = #{city},
				PostalCode = #{postalCode},
				Country = #{country}
			WHERE 
				CustomerID = #{id}
			""")
	int sql4(Customer customer);
	
	@Select("""
			SELECT
				CustomerID id,
				CustomerName name,
				ContactName,
				Address,
				City,
				Country,
				PostalCode
			FROM Customers
			WHERE CustomerID = #{id}
			""")
	Customer sql5(int id);
	
	@Select("""
			SELECT 
				EmployeeID id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeID = #{id}
			""")
	Employee sql6(int id);
	
	@Update("""
			UPDATE Employees
			SET
				LastName = #{lastName},
				FirstName = #{firstName},
				BirthDate = #{birth},
				Photo = #{photo},
				Notes = #{notes}
			WHERE EmployeeID = #{id}
			""")
	int sql7(Employee employee);
}
