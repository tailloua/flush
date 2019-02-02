package com.mvc.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

	
public ServiceTest() {
     System.out.println("heeey ");
	}

public int  add (int t1 , int t2) {
	
	System.out.println("heeey ");
	
	int k = t1 + t2;
    return k;
}




public int  addTestbranch (int t1 , int t2) {
	
	System.out.println("heeey branch");
	
	int k = t1 + t2;
    return k;
}


public void  addTestbranch1 (int t1 , int t2) {
	
	System.out.println("heeey branch");
}

	
public int  adddepuisGit1 (int t1 , int t2) {
	
	System.out.println("heeey ");
	
	int k = t1 + t2;
    return k;
}

}
