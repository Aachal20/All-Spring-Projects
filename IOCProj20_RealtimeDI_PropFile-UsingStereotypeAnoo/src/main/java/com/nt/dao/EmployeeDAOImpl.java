package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("dao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String REALTIME_DI_INSERT_EMPLOYEE = "INSERT INTO REALTIME_DI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	
	//Has-A Mapping
	@Autowired
	private DataSource ds;


	/*	public EmployeeDAOImpl(DataSource ds) {
			super();
			this.ds = ds;
			System.out.println("EmployeeDAOImpl:: 0-param constructor");
		}*/

	@Override
	public int insertEmployee(EmployeeBo bo) {
		
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		int result = 0;
		//give pooled jdbc connection object and create preparedStatement obj
		try(Connection con = ds.getConnection();
		       PreparedStatement ps = con.prepareStatement(REALTIME_DI_INSERT_EMPLOYEE)
		         ){
			
			//set values to query param
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			
			
			//execute the query
			result = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}//method
	}//class




