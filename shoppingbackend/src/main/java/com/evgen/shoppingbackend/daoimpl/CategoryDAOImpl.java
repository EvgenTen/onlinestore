package com.evgen.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.evgen.shoppingbackend.dao.CategoryDAO;
import com.evgen.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		// 1st category
		category.setId(1);
		category.setName("TV set");
		category.setDescription("Some new TV");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// 2nd category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Some new Mobile phone");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// 3nd category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Some new Laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		//enchanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
