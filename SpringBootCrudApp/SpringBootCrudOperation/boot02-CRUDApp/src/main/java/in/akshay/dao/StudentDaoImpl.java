package in.akshay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.akshay.bo.StudentBo;

@Repository(value="studentdao")
public class StudentDaoImpl implements IStudentDao {
	private static final String SQL_INSERT_QUERY="insert into student(`sname`,`saddress`,`sage`,`sdob`)values(?,?,?,?)";
	
	@Autowired(required=true)
	private DataSource datasource;

	@Override
	public String save(StudentBo bo) {
		int count=0;
		try(Connection connection =datasource.getConnection(); PreparedStatement prst=connection.prepareStatement(SQL_INSERT_QUERY)) {
			prst.setString(1, bo.getSname());
			prst.setString(2, bo.getSaddrss());
			prst.setInt(3, bo.getSage());
			prst.setDate(4, java.sql.Date.valueOf(bo.getSdob()));
			
			count = prst.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count==0?"data doesn't saved":"Data saved successfully";
	}
	
}
