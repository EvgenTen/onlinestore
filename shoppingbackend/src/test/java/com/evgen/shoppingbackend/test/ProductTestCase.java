package com.evgen.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.evgen.shoppingbackend.dao.ProductDAO;
import com.evgen.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.evgen.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
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

	
	/*
	@Test
	public void testCRUDProduct() {

		// Add operation
		product = new Product();

		product.setName("Oppo mobila");
		product.setBrand("Oppo");
		product.setDescription("Some new oppo");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);

		assertEquals("Something went wrong wile inserting a new product!", true, productDAO.add(product));

		// Read & Update the product
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");

		assertEquals("Something went wrong wile updating the existing record!", true, productDAO.update(product));

//		// Update
//		product = productDAO.get(1);
//
//		product.setName("Morkovka");
//		assertEquals("Successfully fetched a single category from the table!", true, productDAO.update(product));

		// Delete
		product = productDAO.get(2);

		assertEquals("Something went wrong wile deleting a single product from the table!", true, productDAO.delete(product));

		// Fettching List
		assertEquals("Successfully fetched the list of products from the table!", 6, productDAO.list().size());
	}
	*/
	
	@Test
	public void testListOfActiveProducts() {
	assertEquals("Something went wrong wile fetching the of products!", 5, productDAO.listActiveProducts().size());

	}

	
	@Test
	public void testListOfActiveProductsByCategory() {
	assertEquals("Something went wrong wile fetching the of products by category!", 3, productDAO.listActiveProductsByCategory(3).size());

	assertEquals("Something went wrong wile fetching the of products by category!", 2, productDAO.listActiveProductsByCategory(1).size());

	}
	
	@Test
	public void testGetLatestActiveProduct() {
	assertEquals("Something went wrong wile fetching latest active products!", 3, productDAO.getLatestActiveProducts(3).size());

	}
}
