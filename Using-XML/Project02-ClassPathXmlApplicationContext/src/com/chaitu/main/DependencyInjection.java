package com.chaitu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.A;

public class DependencyInjection {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chaitu/cfgs/applicationContext.xml");
		Object b = ctx.getBean("a");
		A bean = (A) b;
		System.out.println("By Using ClassPathXmlApplicationContext ::");
		System.out.println(bean);
		ctx.close();

	}
}

