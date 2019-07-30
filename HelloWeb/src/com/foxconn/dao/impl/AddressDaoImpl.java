package com.foxconn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.foxconn.dao.AddressDao;
import com.foxconn.dto.Address;

public class AddressDaoImpl implements AddressDao {

	@Override
	public void save(Connection conn, Address address) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO tbl_address(city,country,user_id) values (?, ?, ?)");
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getUserId());
		ps.execute();
		
	}

	@Override
	public void update(Connection conn, Long id, Address address) throws SQLException {
		String updateSql = "UPDATE tbl_address SET city = ?, country = ?, WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getId());
		ps.execute();
		
	}

	@Override
	public void delete(Connection conn, Address address) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("DELETE FROM tbl_address WHERE id = ?");
		ps.setLong(1, address.getId());
		ps.execute();
		
	}

}
