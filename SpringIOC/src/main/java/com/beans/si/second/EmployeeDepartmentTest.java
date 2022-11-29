package com.beans.si.second;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeDepartmentTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/bean-config/si/office/emp-dept.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee) factory.getBean("empBean");
		
		System.out.println(emp);

	}

}