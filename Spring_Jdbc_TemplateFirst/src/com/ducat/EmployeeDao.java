package com.ducat;
import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDao 
{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/*public int saveEmployee(Employee e){
		String query="insert into employee1 values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(Employee e){
		String query="update employee1 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}*/
	public int deleteEmployee(Employee e){
		String query="delete from employee1 where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}


}
