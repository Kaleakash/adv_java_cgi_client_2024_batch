package com.dao;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository    
public class ProductDao {

	@Autowired
	DataSource ds; 		// auto wired using byType 
	
	public String storeProduct() {
		try {
			Connection con = ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
