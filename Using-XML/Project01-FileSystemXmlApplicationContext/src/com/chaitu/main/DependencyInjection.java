package com.chaitu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chaitu.sbeans.A;

public class DependencyInjection {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/chaitu/cfgs/applicationContext.xml");
		Object b = ctx.getBean("a");
		A bean = (A) b;
		System.out.println("By Using FileSystemXmlApplicationContext ::");
		System.out.println(bean);
		ctx.close();

	}
}

