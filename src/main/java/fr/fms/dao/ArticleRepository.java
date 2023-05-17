package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{

	public List<Article> findByBrand(String brand);  						//select * from article where brand = 'XXXX';
	public List<Article> findByBrandContains(String brand);					//select * from article where brand like '%XXXX%';
	public List<Article> findByBrandAndPrice(String brand, double price); 	//select * from article where brand = '%XXXX%' and price = YYYY;
	public List<Article> findByBrandAndPriceGreaterThan(String brand, double price);
	
	@Query("select A from Article A where A.brand like %:x% and A.price > :y")
	public List<Article> searchArticles(@Param("x") String brand, @Param("y")double price);
	
	public List<Article> findByCategoryId(Long categoryId);
	
	//exercice 1.2
//	public List<Article> findById(long id);
	public List<Article> findByDescription(String description);
	
	//exercice 1.3
	public List<Article> findByDescriptionAndBrand(String description, String brand);
	public List<Article> findByBrandNot(String brand);
	
	//exercice 1.7
}
