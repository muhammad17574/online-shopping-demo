package net.md.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.md.shoppingbackend.dao.CategoryDAO;
import net.md.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	public static List<Category>  categories = new  ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Televsion");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.PNG");

		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile");
		category.setImageURL("CAT_2.PNG");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop");
		category.setImageURL("CAT_3.PNG");
		categories.add(category);
		
		
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
	
		//enhance for loop
		for(Category category:categories) {
			
			if(category.getId()==id) return category;
			
		}
		
		return null;
	}

}
