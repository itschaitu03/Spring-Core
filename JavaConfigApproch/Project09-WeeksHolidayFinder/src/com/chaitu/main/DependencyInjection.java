package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.cfgs.AppConfig;
import com.chaitu.sbeans.WeeksHolidaysFinder;

public class DependencyInjection {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			WeeksHolidaysFinder bean = ctx.getBean("whf", WeeksHolidaysFinder.class);
			System.out.println("WeeksHolidaysFinder ::" + bean.showHolidays("Chaitu"));
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
