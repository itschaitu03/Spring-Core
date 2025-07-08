package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.A;

public class DependencyInjection {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chaitu/cfgs/applicationContext.xml")) {
			A bean = ctx.getBean("a01", A.class);
			System.out.println("Cyclic or Circular Injection By Using Setter Injection ::");
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
