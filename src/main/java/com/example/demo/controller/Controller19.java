package com.example.demo.controller;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	// 타입에 맞춰서 set메소드를 사용하자
	@RequestMapping("link1")
	public void method1() throws Exception {

		String sql = """
				INSERT INTO MyTable30(col1, col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, 99);
			pstmt.setString(2, "hello");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	// 타입에 대해 엄격하지 않음
	@RequestMapping("link2")
	public void method2() throws Exception {

		String sql = """
				INSERT INTO MyTable30(col1, col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "hello");
			pstmt.setString(1, "888");
			pstmt.setInt(2, 12345);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link3")
	public void method3() throws Exception {

		String sql = """
				INSERT INTO MyTable31(col1, col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, "1923-03-01");
			pstmt.setString(2, "1811-11-12 23:50:49");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link4")
	public void method4() throws Exception {

		String sql = """
				INSERT INTO MyTable31(col1, col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

//			pstmt.setString(1, "1923-03-01"); // col1의 타입을 맞춰주자
//			pstmt.setString(2, "1811-11-12 23:50:49"); //col2의 타입을 맞춰주자
			pstmt.setDate(1, Date.valueOf("2023-03-01"));
			pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 22:22:11"));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link5")
	public void method5() throws Exception {

		String sql = """
				INSERT INTO MyTable32 (name, age, price, birth, inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "kim");
			pstmt.setInt(2, 20);
			pstmt.setDouble(3, 30.12);
			pstmt.setDate(4, Date.valueOf("2023-04-20"));
			pstmt.setTimestamp(5, Timestamp.valueOf("2023-04-20 09:42:50"));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link6")
	public void method6() {
		// form으로 포워딩
	}

	@RequestMapping("link7")
	public void method7(
			String name,
			String age,
			String price,
			String birth,
			String inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32(name, age, price, birth, inserted)
				VALUES (?, ?, ?, ?, ?)
				""";

		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, price);
			pstmt.setString(4, birth);
			pstmt.setString(5, inserted);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link8")
	public void method8(
			String name,
			Integer age,
			Double price,
			LocalDate birth,
			LocalDateTime inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32(name, age, price, birth, inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, price);
			pstmt.setDate(4, Date.valueOf(birth));
			pstmt.setTimestamp(5, Timestamp.valueOf(inserted));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link9")
	public void method9() {
		// form으로 포워딩
	}

	@RequestMapping("link10")
	public void method10(
			String title,
			LocalDate published,
			int price,
			LocalDateTime updated,
			double weight) throws Exception {

		String sql = """
				INSERT INTO MyTable33 (title, published, price, updated, weight)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, title);
			pstmt.setDate(2, Date.valueOf(published));
			pstmt.setInt(3, price);
			pstmt.setTimestamp(4, Timestamp.valueOf(updated));
			pstmt.setDouble(5, weight);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link11")
	public void method11() throws Exception {
		String sql = """
				SELECT * FROM MyTable33
				""";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if (rs.next()) {
				String title = rs.getString("title");
				String published = rs.getString("published");
				String price = rs.getString("price");
				String updated = rs.getString("updated");
				String weight = rs.getString("weight");

				System.out.println("제목: " + title);
				System.out.println("출판일: " + weight);
				System.out.println("가격: " + price);
				System.out.println("구매일: " + updated);
				System.out.println("무게: " + weight);
			}
		}
	}

	@RequestMapping("link12")
	public void method12() throws Exception {
		String sql = """
				SELECT * FROM MyTable33
				""";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if (rs.next()) {
				String title = rs.getString("title");
				LocalDate published = rs.getDate("published").toLocalDate();
				Integer price = rs.getInt("price");
				LocalDateTime updated = rs.getTimestamp("updated").toLocalDateTime();
				Double weight = rs.getDouble("weight");

				System.out.println("제목: " + title);
				System.out.println("출판일: " + weight);
				System.out.println("가격: " + price);
				System.out.println("구매일: " + updated);
				System.out.println("무게: " + weight);
			}
		}
	}

	@RequestMapping("link13")
	public void method13() throws Exception {
		String sql = """
				SELECT * FROM MyTable32
				""";

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double price = rs.getDouble("price");
			LocalDate birth = rs.getDate("birth").toLocalDate();
			LocalDateTime inserted = rs.getTimestamp("inserted").toLocalDateTime();

			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("가격: " + price);
			System.out.println("생일: " + birth);
			System.out.println("기타: " + inserted);
		}
	}

	@RequestMapping("link14")
	public void method14(Model model) throws Exception {
		List<Dto05> list = new ArrayList<>();
		String sql = "SELECT * FROM MyTable32";

		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if (rs.next()) {
				Dto05 o = new Dto05();
				o.setName(rs.getString("name"));
				o.setAge(rs.getInt("age"));
				o.setPrice(rs.getDouble("price"));
				o.setBirth(rs.getDate("birth").toLocalDate());
				o.setInserted(rs.getTimestamp("inserted").toLocalDateTime());
				list.add(o);
			}
				
				model.addAttribute("memberList", list);
		}
	}
	
	@RequestMapping("link15")
	public void method15(Model model) throws Exception {
		List<Dto06> list = new ArrayList<>();
		String sql = "SELECT * FROM MyTable33";
		
		try (
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		) {
		while (rs.next()) {
			Dto06 dto = new Dto06();
			dto.setTitle(rs.getString("title"));
			dto.setPublished(rs.getDate("published").toLocalDate());
			dto.setPrice(rs.getInt("price"));
			dto.setUpdated(rs.getTimestamp("updated").toLocalDateTime());
			dto.setWeight(rs.getDouble("weight"));
			list.add(dto);
		}
		
		model.addAttribute("bookList", list);
		}
		
	}
}
