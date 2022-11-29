package com.spring.beans.ci.third;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CollectionExampleTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/bean-config/ci/collection/collection-bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		CollectionExample listCollection = (CollectionExample) factory.getBean("listObject");
		listCollection.printList();
		System.out.println("---------------------------------");
		CollectionExample setCollection = (CollectionExample) factory.getBean("setObject");
		setCollection.printSet();
		System.out.println("---------------------------------");
		CollectionExample mapCollection = (CollectionExample) factory.getBean("mapObject");
		mapCollection.printMap();
	}

}