package com.mvc.controlleurs;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.entites.Adresse;
import com.mvc.entites.Personne;
import com.mvc.service.ServiceTest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Controlleur {
	
@Autowired
private ServiceTest service ;
@Autowired
private ServiceTest service1 ;


EntityManagerFactory a ;


Integer a ;


	
@RequestMapping("addo")	
public  ModelAndView  add (@RequestParam int t1 , @RequestParam int t2) {

 int k = service.add(t1, t2);
 ModelAndView mv = new  ModelAndView();
 mv.addObject("k", k);
 mv.setViewName("vue.jsp");
 return mv;
 
}


@RequestMapping(value = "add", method = RequestMethod.POST)	
public  void  add (@ModelAttribute("personne")Personne personne) {
	
	    System.out.println(personne);
	
	    
	    Adresse adresse = new Adresse("test","test");
	    Adresse adresse1 = new Adresse("test","test");
	    
	    adresse.setPersonne(personne);
	    adresse1.setPersonne(personne);
	    
	    personne.getAdresse().add(adresse);
	    personne.getAdresse().add(adresse1);
	    Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(Personne.class).addAnnotatedClass(Adresse.class);
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
		SessionFactory  sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		
		Session session = sessionFactoryObj.openSession();
		session.beginTransaction();
		
		//session.update(object);;
		session.save(adresse1);
		session.save(personne);
		
		
		String a  = "select * from etudiant where id := id ";
		session.createNativeQuery(a).setParameter("id", id);
		
		
		
		session.getTransaction().commit();
		
		
		Personne p = session.get(Personne.class,2);
		
		System.out.println(p);
		
		session.close();
		
		
		
		
		 
		
		
	

	




	
	




}







}
