package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) throws Exception {
		String sql = "SELECT CustomerID, CustomerName, Address FROM Customers WHERE CustomerID";

		// 리스트에 담을 거니까 리스트 생성
		List<Customer> obj = new ArrayList<>();

		// 1.
		// 2.
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				int id = rs.getInt("CustomerID");
				String name = rs.getString("CustomerName");
				String address = rs.getString("Address");

				Customer customer = new Customer();
				customer.setId(id);
				customer.setName(name);
				customer.setAddress(address);
				obj.add(customer);
			}
		}
		// 3. add attribute (를 어떻게 받겠는가?)콘솔에 출력하려고 하는일이아니니까
		// list2개를 만들어서 넣을 수 있지만, 자바빈을 만들어서 값을 list에 넣자
		model.addAttribute("customerList", obj);
		// 4.
	}

	@RequestMapping("link2")
	public void method2(Model model) throws Exception {
		String sql = "SELECT EmployeeID, LastName, FirstName FROM Employees";

		// Employee들을 꺼내야 하니까 list 생성
		List<Employee> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs;) {
			while (rs.next()) {
				int id = rs.getInt("EmployeeID");
				String lastName = rs.getString("LastName");
				String firstName = rs.getString("FirstName");

				// Employee 클래스 작성
				// 프로퍼티 (id, lastName, firstName)를 가지게 해야함
				Employee employee = new Employee();
				employee.setId(id);
				employee.setLastName(lastName);
				employee.setFirstName(firstName);
				list.add(employee);
			}
		}
		// 3.add attribute
		model.addAttribute("employeeList", list);
	}
	
	// 경로 : /sub13/link3?id=1이면 1번고객, 2면 2번고객을 보여주기
	@RequestMapping("link3")
	public String method3(@RequestParam String id, Model model) throws Exception {
		List<Customer> list = new ArrayList<>();
		String sql = """
						SELECT CustomerID, CustomerName, Address 
						FROM Customers 
						WHERE CustomerID= """;
		
		sql += id;
		
		//System.out.println(sql);
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();		
		ResultSet rs = stmt.executeQuery(sql);
		
		try(con; stmt; rs;) {
		while(rs.next()) {
			
			Customer customer = new Customer();
			customer.setId(rs.getInt("CustomerID"));
			customer.setName(rs.getString("CustomerName"));
			customer.setAddress (rs.getString("Address"));
			
			list.add(customer);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("customerList", list);
		
		return "/sub13/link1";
	}
	
	@RequestMapping("link4")
	public String method4(@RequestParam String id, Model model) throws Exception {
		List<Customer> list = new ArrayList<>();
		String sql = """
						SELECT CustomerID, CustomerName, Address 
						FROM Customers 
						WHERE CustomerID= ?""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql);	
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		try(con; stmt; rs;) {
			while(rs.next()) {
				
				Customer customer = new Customer();
				customer.setId(rs.getInt("CustomerID"));
				customer.setName(rs.getString("CustomerName"));
				customer.setAddress (rs.getString("Address"));
				
				list.add(customer);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("customerList", list);
		
		return "/sub13/link1";
	}
	
	// 경로 : /sub13/link5?id=3
	@RequestMapping("link5")
	public String method5(@RequestParam String id, Model model ) throws Exception {
		//사용자에게 직원 id 입력 받아서 쿼리 완성하고 실행 후에
		//포워드해서 직원 1명 출력
		List<Employee> list = new ArrayList<>();
		String sql = """
				SELECT EmployeeId,
						lastName,
						firstName
				FROM Employees
				WHERE EmployeeId = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		try(con; pstmt; rs;) {
		while(rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt("EmployeeId"));
			employee.setLastName(rs.getString("lastName"));
			employee.setFirstName(rs.getString("firstName"));
			list.add(employee);
			
		}
	} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("employeeList", list);
		
		return "/sub13/link2";
	}
}
