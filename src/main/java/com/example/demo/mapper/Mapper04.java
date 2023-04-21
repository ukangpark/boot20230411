package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper04 {

	@Delete("""
			DELETE FROM MyTable40
			""")
	int sql1();
	
	@Delete("""
			DELETE FROM MyTable39
			WHERE col1 = #{id}
			""")
	int sql2(Integer id);
	
	@Delete("""
			DELETE FROM Customers
			WHERE CustomerID = #{id}
			""")
	int sql3(Integer id);
}
