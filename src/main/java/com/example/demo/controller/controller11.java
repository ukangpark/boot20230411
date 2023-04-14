package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub11")
public class controller11 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) {
		// 2. business logic
		// 아이디 1 고객이름 조회
		// SELECT CustomerName From Customers WHERE Customer ID = 1;

		String sql = "SELECT CustomerName From Customers WHERE CustomerID = 1";
		try (
				// db연결
				Connection connection = DriverManager.getConnection(url, name, password);
				// Statement 객체 생성
				Statement statement = connection.createStatement();
				// 쿼리실행 (-> statement객체로부터 얻어오면됨) 한후, 쿼리실행 결과 얻고
				ResultSet resultSet = statement.executeQuery(sql);) {
			// 쿼리실행 결과 가공해야함 (쿼리가 있을 때만 이런결과가 일어나야하니깐 if)
			String name = "";
			if (resultSet.next()) {
				name = resultSet.getString("CustomerName");
			}
			// 3. add attribute
			model.addAttribute("customerName", name);
		} catch (Exception e) {
			e.getStackTrace();
		}

		// 4. forward
	}

	@RequestMapping("link2")
	public void method2() {
		String employeeName = "";
		// 2. business logic
		// 아이디 3인 직원의 last name 조회
		String sql = "SELECT lastName FROM Employees WHERE Employeeid = 3";

		try (
				// jdbc가 일하는 패턴
				// 1. 연결하기 drivermanager로 부터 connection 객체를 얻어야함
				Connection con = DriverManager.getConnection(url, name, password);
				// 2. statement 생성
				Statement stmt = con.createStatement();
				// 3. 쿼리 실행 후 resultSet 얻기
				ResultSet rs = stmt.executeQuery(sql);
		// 4. resultSet에 결과 있는지 확인하고
		) {
			if (rs.next()) {
				// 5. 결과 꺼내서 담기
				employeeName = rs.getString("lastName");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println(employeeName);
	}

	@RequestMapping("link3")
	public void method3(Model model) {
		// 2. business logic
		// 아이디가 5인 상품 이름 조회
		String productName = "";
		String sql = "SELECT ProductName FROM Products WHERE ProductID = 5";

		try (
				// 1. 연결하기
				Connection con = DriverManager.getConnection(url, name, password);

				// 2. statement 생성
				Statement stmt = con.createStatement();

				// 3. 쿼리 실행 후, resultSet얻기
				ResultSet rst = stmt.executeQuery(sql);) {
			// 4. resultSet에 결과있는지 확인하고,
			if (rst.next()) {
				// 5. 결과 꺼내서 담기
				productName = rst.getString("ProductName");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println(productName);

		// 3. add attribute
		model.addAttribute("productName", productName);
	}

	@RequestMapping("link4")
	public void method4(Model model) {
		// 업무
		// 고객 이름들 조회
		String sql = """
				SELECT CustomerName
				FROM Customers
				""";
		//레코드가 여러개니까 리스트에 담기
		//레코드들 담을 리스트 생성
		List<String> list = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					// list에 고객 이름들을 담는데, 쿼리 실행결과를 가져와야함
					list.add(rs.getString("CustomerName"));
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		// 3. add attribute
		model.addAttribute("customerName", list);
	}

	@RequestMapping("link5")
	public void method5(Model model) {
		// 직원 이름(firstName)들을 조회해서 jsp로 출력

		String sql = "SELECT firstName FROM Employees";

		// 고객이름을 담아야하니까 List 생성
		List<String> list = new ArrayList<>();

		try {
			// 1. 연결하기
			Connection con = DriverManager.getConnection(url, name, password);

			// 2. Statement 생성
			Statement stmt = con.createStatement();

			// 3. 쿼리 실행후 ResultSet에 담기
			ResultSet rs = stmt.executeQuery(sql);

			// 4. list에 담기
			try (con; stmt; rs;) {
				while (rs.next()) {
					list.add(rs.getString("firstName"));
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		model.addAttribute("firstName", list);
	}
}
