package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {
	
	Connection conn = null;

	public DepartmentDaoJDBC(Connection connection) {
		conn = connection;
	}

	@Override
	public void insert(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement("SELECT * FROM department WHERE Id = ? ");
			st.setInt(1, id);
			
			rs = st.executeQuery();
			
			
			Department dep = null;
			
			while(rs.next()) {
				dep = new Department(rs.getInt("Id"),rs.getString("Name"));
			}
			return dep;
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		
		
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
