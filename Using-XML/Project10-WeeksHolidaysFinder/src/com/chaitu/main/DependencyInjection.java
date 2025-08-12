package com.chaitu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.WeeksHolidaysFinder;

public class DependencyInjection {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chaitu/cfgs/applicationContext.xml")) {
			WeeksHolidaysFinder bean = ctx.getBean("whf", WeeksHolidaysFinder.class);
			System.out.println("WeeksHolidaysFinder ::" + bean.showHolidays("Chaitu"));
			System.out.println(bean);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
