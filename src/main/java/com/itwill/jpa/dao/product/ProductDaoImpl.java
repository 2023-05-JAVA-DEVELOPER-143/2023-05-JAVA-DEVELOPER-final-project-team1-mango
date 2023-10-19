package com.itwill.jpa.dao.product;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.itwill.jpa.dto.product.ProductDto;
import com.itwill.jpa.entity.product.Product;
import com.itwill.jpa.entity.product.Product.Music;
import com.itwill.jpa.repository.product.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao{
	private final ProductRepository productRepository;
	
	public ProductDaoImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public Product insertProduct(Product product) {
		// TODO Auto-generated method stub
		Product insertProduct = productRepository.save(product);
		return insertProduct;
	}

	@Override
	public Product selectProduct(Long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long no) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public List<ProductDao> getAllMusicByProductNoDesc() {
		// TODO Auto-generated method stub
		return null;
	}
}
