package dev.roshan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String args[])
	{
		Resource r = new ClassPathResource("bean.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Employee e = (Employee)f.getBean("obj");
		e.disp();
	}
}
