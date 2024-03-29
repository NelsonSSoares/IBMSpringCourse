package com.nelson.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nelson.spring.springorm.product.dao.ProductDao;
import com.nelson.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nelson/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*Product product = new Product();
		product.setId(1);
		product.setName("Notebook");
		product.setDescription("ThinkPad");
		product.setPrice(1200);
		//productDao.create(product);
		//productDao.update(product);
		productDao.delete(product); */
		//Product product = productDao.find(1);
		List<Product> products = productDao.findAll();
		System.out.println(products);
	}

}
