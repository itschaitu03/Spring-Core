package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.cfgs.AppConfig;
import com.chaitu.sbeans.WishMessageGenerator;

public class DependencyInjection {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			WishMessageGenerator bean = ctx.getBean("wmg", WishMessageGenerator.class);
			System.out.println("WishMessageGenerator ::" + bean.showMessage("Chaitu"));
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}

