package com.Spring.Lab19;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Bank;

public class Lab19Application {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("Context.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Bank bank = (Bank) b.getBean("bank");
		bank.display();
	}

}
