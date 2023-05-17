package fr.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{

}
