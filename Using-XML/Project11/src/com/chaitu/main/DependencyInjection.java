package com.chaitu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.Mobile;

public class DependencyInjection {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chaitu/cfgs/applicationContext.xml")) {
			Mobile bean = ctx.getBean("m", Mobile.class);
			System.out.println("Mobile And Battery ::" + bean.mobileBatteryStatus("Chaitu"));
			System.out.println(bean);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}