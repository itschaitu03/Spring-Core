package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chaitu.sbeans.A;

public class DependencyInjection {

	public static void main(String[] args) {

		try (FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/chaitu/cfgs/applicationContext.xml")) {
			A bean = ctx.getBean("a", A.class);
			System.out.println("By Using Multiple Setter Methods ::");
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
