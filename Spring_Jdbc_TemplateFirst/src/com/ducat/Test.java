package com.ducat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		/*int status=dao.saveEmployee(new Employee(11,"sachin",5100));
		System.out.println(status);
		
		int status=dao.updateEmployee(new Employee(11,"umika",19000));
		System.out.println(status);*/
		
		
		Employee e=new Employee();
		e.setId(11);
		int status=dao.deleteEmployee(e);
		System.out.println(status);
		
	}

}



