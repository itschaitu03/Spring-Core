package com.chaitu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitu.sbeans.SeasonFinder;

public class DependencyInjection {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chaitu/cfgs/applicationContext.xml")) {
			SeasonFinder bean = ctx.getBean("sf", SeasonFinder.class);
			System.out.println("SeasonFinder ::" + bean.showSeason("Chaitu"));
			System.out.println(bean);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
