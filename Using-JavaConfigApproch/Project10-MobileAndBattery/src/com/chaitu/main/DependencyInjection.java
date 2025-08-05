package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.cfgs.AppConfig;
import com.chaitu.sbeans.Mobile;

public class DependencyInjection {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Mobile bean = ctx.getBean("m", Mobile.class);
			System.out.println("Mobile And Battery Status ::" + bean.mobileBatteryStatus("Chaitu"));
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}

