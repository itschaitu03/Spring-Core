package com.chaitu.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.cfgs.AppConfig;
import com.chaitu.sbeans.SeasonFinder;

public class DependencyInjection {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			SeasonFinder bean = ctx.getBean("sf", SeasonFinder.class);
			System.out.println("SeasonFinder ::" + bean.showSeason("Chaitu"));
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}
}

