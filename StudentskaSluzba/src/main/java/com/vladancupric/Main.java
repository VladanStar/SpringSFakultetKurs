package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
				
				Kurs kurs = (Kurs)context.getBean("kurs");
				System.out.println(kurs.toString());
				((FileSystemXmlApplicationContext)context).close();

	}

}
