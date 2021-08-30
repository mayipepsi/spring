package com.pepsi.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanDefinitionTest {

	public static void main(String[] args) {


		ClassPathResource resource = new ClassPathResource("bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		int i = reader.loadBeanDefinitions(resource);
		System.out.println(i);
	}
}
