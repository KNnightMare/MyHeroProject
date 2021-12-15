package com.qa.service;

import java.util.List;

public interface HeroServiceMethods<T> {
	
//	Create Hero
	T create (T t);

//	Display all Heroes
	List<T> displayAll();
	
//	Search a Hero by ID
	T searchById (long id);
	
//	Modify a Hero by ID
	T update (long id, T t);
	
//	Delete a Hero by ID
	T deleteById (long id);
	
}
