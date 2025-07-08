package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.WishMessageGenerator;

public class DependencyInjection {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/chaitu/cfgs/applicationContext.xml")) {
			WishMessageGenerator bean = ctx.getBean("wmg", WishMessageGenerator.class);
			System.out.println("WishMessageGenerator :: " + bean.showMessage("Chaitu"));
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
