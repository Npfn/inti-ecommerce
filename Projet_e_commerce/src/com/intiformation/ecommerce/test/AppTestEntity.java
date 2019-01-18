package com.intiformation.ecommerce.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;
import com.intiformation.ecommerce.service.IAdminCategoriesService;

public class AppTestEntity {

	public static void main(String[] args) {
		// context
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		IAdminCategoriesService catManager = (IAdminCategoriesService) context.getBean("boutiqueServiceBean") ;
		
		
		// ajout user
		User user1 = new User("Tonve1962", "Shie7xaing", true, null) ;
		User user2 = new User("Vestoing48", "Cuo4Ahsi", true, null) ;
		
		
//		catManager.addUser(user1);
//		catManager.addUser(user2);
		

		
		

	}

}
