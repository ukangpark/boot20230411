package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {
	
	@Insert("""
			INSERT INTO MyTable34(col1, col2)
			VALUES (#{val1}, #{val2})
			""")
	int sql1(Integer val1, String val2); //파라미터 순서 상관 없음 sql에 받을 파라미터명의 순서에 들어감
	
	@Insert("""
			INSERT INTO MyTable35(col1, col2)
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	
	// 파라미터 1개일 때 프로퍼티명만 작성하면 됨 
	@Insert("""
			INSERT INTO MyTable36 (col1, col2, col3)
			VALUES(#{prop1}, #{prop2}, #{prop3} );
			""")
	int sql3(Dto09 dto);
	
	@Insert("""
			INSERT INTO MyTable37 (name, age, score)
			VALUES(#{name}, #{age}, #{score})
			""")
	int sql5(Dto10 dto);
	
	@Insert("""
			INSERT INTO MyTable37 (name, age, score)
			VALUES(#{dto10.name}, #{dto9.prop1}, #{dto9.prop3})
			""")
	int sql6(Dto09 dto9, Dto10 dto10);
	
	@Insert("""
			INSERT INTO MyTable38(col1,col2,col3,col4,col5,col6)
			VALUES (#{dto1.prop1}, 
					#{dto2.age}, 
					#{dto1.prop2}, 
					#{dto2.name}, 
					#{dto1.prop3}, 
					#{dto2.score})
			""")
	int sql7(Dto09 dto1, Dto10 dto2);
	
	@Insert("""
			INSERT INTO MyTable39 (col2, col3)
			VALUES (#{prop2}, #{prop3})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "prop1")
	int sql8(Dto11 dto);
	
	@Insert("""
			INSERT INTO MyTable40(age, name, score)
			VALUES (#{age}, #{name}, #{score})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int sql9(Dto12 dto);
	
	
	
	
	

}
