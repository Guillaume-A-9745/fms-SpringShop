package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRespository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {
	@Autowired
	private CategoryRespository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		categoryRepository.save(new Category("Smartphone"));
//		articleRepository.save(new Article("S9","Samsung",250));
//		articleRepository.save(new Article("S8","Samsung",200));
//		articleRepository.save(new Article("Iphone 12","Apple",1500));
//		articleRepository.save(new Article("Galaxy Tab","Samsung",350));
		
//		for(Article article : articleRepository.findByBrand("Samsung")) {
//			System.out.println(article);
//		}
//		for(Article article : articleRepository.findByBrandAndPrice("Samsung", 250)) {
//			System.out.println(article);
//		}
//		for(Article article : articleRepository.findByBrandAndPriceGreaterThan("Samsung", 300)) {
//			System.out.println(article);
//		}
//		for(Article article : articleRepository.searchArticles("sung", 200)) {
//			System.out.println(article);
//		}
		
//		Category smartphone = categoryRepository.save(new Category("Smartphone"));
//		Category tablet = categoryRepository.save(new Category("Tablet"));
//		Category pc = categoryRepository.save(new Category("PC"));
//		
//		articleRepository.save(new Article("S10","Samsung", 500, smartphone));
//		articleRepository.save(new Article("S9","Samsung", 350, smartphone));
//		articleRepository.save(new Article("MI10","Xiaomi", 100, smartphone));
//		articleRepository.save(new Article("Galaxy Tab","Samsung", 450, tablet));
//		articleRepository.save(new Article("Ipad","Apple", 350, tablet));
//		articleRepository.save(new Article("R510","Asus", 600, pc));
		
		for(Article article : articleRepository.findByCategoryId((long) 1)) {
			System.out.println(article);
		}
	}
}
