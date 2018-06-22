package com.evgen.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.evgen.shoppingbackend.dao.CategoryDAO;
import com.evgen.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.evgen.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * 
	 * category.setName("Laptop"); category.setDescription("Some new laptops");
	 * category.setImageURL("CAT_laptop.png");
	 * 
	 * assertEquals("Sucsessfully added a category inside the table!", true,
	 * categoryDAO.add(category)); }
	 * 
	 * 
	 * 
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * assertEquals("Successfully fetched a single category from the table!",
	 * "Laptop", category.getName()); }
	 * 
	 * 
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * category.setName("Balalaika");
	 * assertEquals("Successfully fetched a single category from the table!", true,
	 * categoryDAO.update(category)); }
	 * 
	 * 
	 * @Test public void testDeleteCategory( ) {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully unactived a single category from the table!",
	 * true, categoryDAO.delete(category));
	 * 
	 * }
	 * 
	 * @Test public void testListCategory( ) {
	 * 
	 * 
	 * assertEquals("Successfully fetched the list of categories from the table!",2,
	 * categoryDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testCRUDCategory() {

		// Add operation
		category = new Category();

		category.setName("MP3");
		category.setDescription("Some new players");
		category.setImageURL("CAT_105.png");

		assertEquals("Sucsessfully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("pilesos");
		category.setDescription("Some new soska");
		category.setImageURL("CAT_101.png"); 

		assertEquals("Sucsessfully added a category inside the table!", true, categoryDAO.add(category));

		// Read
		category = categoryDAO.get(2);

		assertEquals("Successfully fetched a single category from the table!", "pilesos", category.getName());

		// Update
		category = categoryDAO.get(1);

		category.setName("Morkovka");
		assertEquals("Successfully fetched a single category from the table!", true, categoryDAO.update(category));

		// Delete
		category = categoryDAO.get(2);

		assertEquals("Successfully unactived a single category from the table!", true, categoryDAO.delete(category));

		// Fettching List
		assertEquals("Successfully fetched the list of categories from the table!", 1, categoryDAO.list().size());
	}

}
