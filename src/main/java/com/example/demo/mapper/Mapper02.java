package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper02 {

	@Select("""
			SELECT CustomerName FROM Customers
			""")
	List<String> sql1(); //여러개의 행을 받을 꺼니까 list로 리턴 
	
	@Select("""
			SELECT LastName FROM Employees
			""")
	List<String> sql2();
	
	@Select("""
			SELECT LastName, FirstName FROM Employees
			""")
	List<Dto07> sql3();
	
	@Select("""
			SELECT ProductName, Price FROM Products
			""")
	List<Dto08> sql4();
	
	@Select("""
			SELECT ProductName
			FROM Products
			WHERE CategoryId = #{id}
			""")
	List<String> sql5(Integer id);
	
	@Select("""
			SELECT CustomerName 
			FROM Customers 
			WHERE Country = #{country}
			""")
	List<String> sql6(String country);
	
	@Select("""
			SELECT ProductName, Price
			FROM Products
			WHERE CategoryId = #{cid}
			""")
	List<Dto08> sql7(Integer cid);
}
	

