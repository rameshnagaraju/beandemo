package com.rameshn.beandemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeandemoApplication {
	public static void main(String[] args) {
		// SpringApplication.run(BeandemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		String s = obj.getName();
		System.out.println("Hello " + s);
	}
}
