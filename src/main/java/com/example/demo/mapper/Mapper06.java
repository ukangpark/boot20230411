package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper06 {

	@Select("""
			SELECT 
				CustomerID id,
				CustomerName name,
				ContactName,
				Address
			FROM Customers
			ORDER BY CustomerID DESC
			LIMIT #{startIndex}, 20
			""")
	List<Customer> listCustomer(Integer startIndex);

	@Select("""
			SELECT COUNT(*) FROM Customers
			""")
	Integer countAll();
	
	

}
