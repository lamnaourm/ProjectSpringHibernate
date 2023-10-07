package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IDao;
import com.models.Produit;

public class Main {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		IDao<Produit> dao = (IDao)ctx.getBean("daoProduit");
		
 		System.out.println(dao.getAll().size());


	}

}
