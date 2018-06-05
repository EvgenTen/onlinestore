package com.evgen.shoppingbackend.dao;

import java.util.List;

import com.evgen.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
