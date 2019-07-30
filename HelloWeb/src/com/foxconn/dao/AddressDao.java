package com.foxconn.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.foxconn.dto.Address;


public interface AddressDao {
	public void save(Connection conn, Address address) throws SQLException;

	public void update(Connection conn, Long id, Address address) throws SQLException;

	public void delete(Connection conn, Address address) throws SQLException;
}
