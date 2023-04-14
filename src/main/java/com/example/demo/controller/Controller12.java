package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT LastName FROM Employees
				""";

		try {
			Connection con = DriverManager.getConnection(url, name, password);

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				System.out.println(rs.next());
				String name1 = rs.getString("lastName");
				System.out.println(name1);
				System.out.println(rs.next());// true
				String name2 = rs.getString("lastName");
				System.out.println(name2);
				System.out.println(rs.next());// true
				String name3 = rs.getString("lastName");
				System.out.println(name3);
				System.out.println(rs.next());// true
				String name4 = rs.getString("lastName");
				System.out.println(name4);
				System.out.println(rs.next());// true
				String name5 = rs.getString("lastName");
				System.out.println(name5);
				System.out.println(rs.next());// true
				String name6 = rs.getString("lastName");
				System.out.println(name6);
				System.out.println(rs.next());// true
				String name = rs.getString("lastName");
				System.out.println(name1);
				System.out.println(rs.next());// true
				String name7 = rs.getString("lastName");
				System.out.println(name7);
				System.out.println(rs.next());// true
				String name8 = rs.getString("lastName");
				System.out.println(name8);
				System.out.println(rs.next());// false(10번째는 false가 나옴 - 더이상 호출할 값이 없기 때문)
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";

		try {
			Connection con = DriverManager.getConnection(url, name, password);

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping("link3")
	public void method3(Model model) {

		String sql = "SELECT ShipperName FROM Shippers";
		List<String> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()/* next메소드의 결과가 true인 동안 코드 실행해라 */) {
					list.add(rs.getString("ShipperName"));
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		model.addAttribute("shipperName", list);
	}

	@RequestMapping("link4")
	public void method4() {
		String sql = "SELECT * FROM Customers";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				rs.next();// 커서가 여기 있는 상태에서 다른 컬럼들을 가지고오고싶다.
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));

				rs.next();
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping("link5")
	public void method5() {
		String sql = "SELECT * FROM Customers";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println("#########");
					System.out.println(rs.getString("customerName"));
					System.out.println(rs.getString("contactName"));
					System.out.println(rs.getString("country"));

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping("link6")
	public void method6() throws Exception {

		String sql = "SELECT * FROM Products WHERE ProductId <= 3";

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				System.out.println(rs.getString("ProductID"));// int타입이지만 String으로 꺼낼수있음
				System.out.println(rs.getInt("ProductID"));// int타입이지만 String으로 꺼낼수있음
				System.out.println(rs.getString("ProductName"));
				System.out.println(rs.getString("price"));// double타입이지만 String으로 꺼낼수있음
				System.out.println(rs.getDouble("price"));// double타입이지만 String으로 꺼낼수있음
			}
		}
	}

	@RequestMapping("link7")
	public void method7() throws Exception {
		String sql = "SELECT * FROM Customers WHERE CustomerID < 4";

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}

	}

	@RequestMapping("link8")
	public void method8() throws Exception {
		String sql = "SELECT LastName, FirstName FROM Employees WHERE EmployeeID < 4";

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				String lastName = rs.getString(1);
				String firstName = rs.getString(2);

				System.out.println(lastName + "," + firstName);
			}
		}
	}

	@RequestMapping("link9")
	public void method9() throws Exception {
		String sql = "SELECT CustomerID, CustomerName, Country FROM Customers";

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				int customerId = rs.getInt(1);
				String customerName = rs.getString(2);
				String country = rs.getString(3);

				System.out.println(customerId + "," + customerName + "," + country);
			}
		}
	}
	

}
