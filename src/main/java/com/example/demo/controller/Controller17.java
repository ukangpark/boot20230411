package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("link1")
	public void method1(int id, String name) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?
				WHERE SupplierID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, this.name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 수정됨");
		
		try(con; pstmt;) {
			
		}
	}
	
	@RequestMapping("link2")
	public void method2(int id, String address) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					Address = ?
				WHERE SupplierID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, address);
		pstmt.setInt(2, id);
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행이 수정됨");
		
		try(con; pstmt;) {
			
		}
	}

	@RequestMapping("link3")
	public void method3(Supplier supplier) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?,
					Phone = ?
				WHERE
					SupplierID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, supplier.getName());
		pstmt.setString(2, supplier.getContactName());
		pstmt.setString(3, supplier.getAddress());
		pstmt.setString(4, supplier.getCity());
		pstmt.setString(5, supplier.getPostalCode());
		pstmt.setString(6, supplier.getCountry());
		pstmt.setString(7, supplier.getPhone());
		pstmt.setInt(8, supplier.getId());
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 수정됨");
		System.out.println(supplier.getId() + "번 공급자 수정됨");
		
		try(con; pstmt; ) {
			
		}
	}
	
	// /sub7/link4?id=65
	@RequestMapping("link4")
	public void method4(int id, Model model) throws Exception {
		String sql = """
				SELECT
					SupplierName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country,
					Phone
				FROM Suppliers
				WHERE SupplierID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		try(con; pstmt; rs; ) {
		if(rs.next()) {
			Supplier supplier = new Supplier();
			supplier.setId(rs.getInt("supplierID"));
			supplier.setName(rs.getString("supplierName"));
			supplier.setContactName(rs.getString("contactName"));
			supplier.setAddress(rs.getString("address"));
			supplier.setCity(rs.getString("city"));
			supplier.setPostalCode(rs.getString("postalCode"));
			supplier.setCountry(rs.getString("country"));
			supplier.setPhone(rs.getString("phone"));
			model.addAttribute("supplier", supplier);
			
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//고객조회
	@RequestMapping("link5")
	public void method5(int id, Model model) throws Exception {
		
		String sql = """
				SELECT

					CustomerName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country
				FROM Customers
				WHERE CustomerID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		try(con; pstmt; rs;) {
		if(rs.next()) {
			Customer customer = new Customer();
			customer.setId(id);
			customer.setName(rs.getString("CustomerName"));
			customer.setContactName(rs.getString("ContactName"));
			customer.setAddress(rs.getString("Address"));
			customer.setCity(rs.getString("City"));
			customer.setPostalCode(rs.getString("PostalCode"));
			customer.setCountry(rs.getString("Country"));
			
			model.addAttribute("customer", customer);
		}
		}
		
	}
	
	// 고객정보 수정
	@RequestMapping("link6")
	public void method6(Customer customer) throws Exception {
		String sql = """
				UPDATE Customers
				SET
					CustomerName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?
				WHERE CustomerID = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, customer.getName());
		pstmt.setString(2, customer.getContactName());
		pstmt.setString(3, customer.getAddress());
		pstmt.setString(4, customer.getCity());
		pstmt.setString(5, customer.getPostalCode());
		pstmt.setString(6, customer.getCountry());
		pstmt.setInt(7, customer.getId());
		int cnt = pstmt.executeUpdate();
		System.out.println(customer.getId() + "번 고객 수정됨");
		System.out.println(cnt + "개 행이 수정됨");
	}
}
