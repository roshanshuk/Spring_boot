package dev.roshan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String args[])
	{
		Resource re = new ClassPathResource("application.xml");
		BeanFactory factory = new XmlBeanFactory(re);
		Employee s = (Employee)factory.getBean("em");
		s.show();
	}
}
