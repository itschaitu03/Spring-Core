package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.cfgs.AppConfig;
import com.chaitu.sbeans.A;

public class DependencyInjection {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			A bean = ctx.getBean("a", A.class);
			System.out.println("By using the Constructor Injection::");
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}

