package net.md.shoppingbackend.dao;

import java.util.List;

import net.md.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);
	

}
