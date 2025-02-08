package com.chinmay.SpringJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.chinmay.SpringJDBC.model.Student;

@Repository
public class StudentRepo {
		private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student s) {
		String sql="insert into student (id,name,marks) values(?,?,?)";

		int i=jdbcTemplate.update(sql,s.getRolNum(),s.getName(),s.getMarks());//Returns the number of rows Effected.
		System.out.println(i+ "rows affected");
	}
	public List<Student> findAll() {

		String sql="select * from student";
		RowMapper<Student> rowmapper=new RowMapper<Student>()
				{

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                            Student s=new Student();
                            s.setRolNum(rs.getInt("id"));
                            s.setName(rs.getString("name"));
                            s.setMarks(rs.getInt("marks"));
                            return s;
					}
					
				};
		return jdbcTemplate.query(sql,rowmapper);
	}

}
