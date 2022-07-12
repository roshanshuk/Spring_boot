package dev.roshan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String args[])
	{
		Resource r = new ClassPathResource("application.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Question qu = (Question)f.getBean("q");
		qu.disp();
	}
}
