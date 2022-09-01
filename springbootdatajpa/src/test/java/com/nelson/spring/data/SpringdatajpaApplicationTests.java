package com.nelson.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.nelson.spring.data.entities.Product;
import com.nelson.spring.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setId(4);
		product.setName("RTX2060");
		product.setDescription("Powerfull Graphic Card");
		product.setPrice(1000d);
//		repository.save(product);
//		Optional<Product> productOptional = repository.findById(1L);
//
//		if (productOptional.isPresent()) {
//			Product result = productOptional.get();
//			System.out.println(result);
//
//			result.setPrice(1500.00);
//
//			repository.save(result);
//
//		} else {
//			System.out.println("Product not located");
//		}
//
//		repository.findAll().forEach(p -> {
//			System.out.println(p.getPrice());
//		});
		
//		System.out.println(repository.findByName("Notebook"));
//		System.out.println(repository.findByPrice(1500d));
		System.out.println(repository.findByNameAndPrice("Computer", 1500d ));

	}

}
