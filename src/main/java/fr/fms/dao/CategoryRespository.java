package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{
	
	//exercice 1.5
	public List<Category> findByOrderByName();
	public List<Category> findByOrderByNameDesc();
}
