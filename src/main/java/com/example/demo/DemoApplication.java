package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext cxt =
				new ClassPathXmlApplicationContext("spring-beans.xml");
		FoodPantry f1 = (FoodPantry) cxt.getBean("bean1");
		FoodPantry f2 = (FoodPantry) cxt.getBean("bean2");
		System.out.println(f1.toString());
		System.out.println(f2.toString());

		Company company = (Company) cxt.getBean("companyBean");
		System.out.println(company.toString());

		Service service = (Service) cxt.getBean("serviceBean");
		service.setMessage("Hello");
		service = (Service) cxt.getBean("serviceBean");
		System.out.println(service.getMessage());

		SpringApplication.run(DemoApplication.class, args);
	}

}
