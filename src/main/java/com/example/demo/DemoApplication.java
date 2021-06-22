package com.example.demo;

import com.example.demo.beans.Customer;
import com.example.demo.models.Company;
import com.example.demo.models.FoodPantry;
import com.example.demo.models.Panda;
import com.example.demo.models.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.models")
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

		Service service = new Service();
		service.setMessage("Hello");
		//service = (Service) cxt.getBean("service");
		System.out.println(service.getMessage());

		Customer customer = new Customer();
		System.out.println(customer.toString());

		Panda panda = new Panda();
		System.out.println(panda.toString());
		SpringApplication.run(DemoApplication.class, args);
	}

}
