package com.itwill.jpa.service.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.jpa.entity.product.Product;
import com.itwill.jpa.entity.product.ProductCategory;
import com.itwill.jpa.entity.product.Product.Goods;
import com.itwill.jpa.entity.product.Product.Membership;
import com.itwill.jpa.entity.product.Product.Music;
import com.itwill.jpa.entity.product.Product.Ticket;



@Service
@Transactional(readOnly = true)
//@RequiredArgsConstructor
public interface ProductService{
	
	@Transactional
//Product//	
	Product getProduct(Long productNo); 
	
	List<Product> productList(); 
	
	
	// 좋아요 누르기 기능[성공]
	Long checkLikeService(Long productNo);

	// 품절 안내 기능[성공]
	Product outOfStockMsg(Long productNo);

	/******************** insert ********************/
	// product 등록[성공]
	public Product insertProduct(Product product);	
	// music 등록[성공]
	public Music insertMusic(Music music);
	// music 등록[성공]
	public Goods insertGoods(Goods goods);
	// music 등록[성공]
	public Ticket insertTicket(Ticket ticket);
	// music 등록[성공]
	public Membership insertMembership(Membership membership);
	/*********************************************/
	
	// product 삭제[성공]		
	void deleteProduct(Long productNo) throws Exception;
	
	// product 삭제[성공]
//	public void deleteProduct2(Long productNo);
	
	// product 업데이트[성공]
	public Product updateProduct(Product product);
		
	// product 조회수 올리기[성공]
	public Product increaseReadCount(Product product);
	
	// product 조회수별 내림차순 정렬 [성공]
	public List<Product> getProductOrderByReadCountDesc();
	
	// product 조회수별 오름차순 정렬 [성공]
	public List<Product> getProductOrderByReadCountAsc();
	
	// 키워드로 검색[테스트중]
	public List<Product> searchProductsByKeyword(String keyword);
	
	// product categoryId별 분류
	public List<Product> findByCategoryId(Long categoryId);
	
	// product category별 분류[성공]
	List<Product> findByProductCategory(ProductCategory categoryId);
	
	// productNo 찾기[성공]
	public Optional<Product> findByProductNo(Long productNo);
	
	// productName 찾기
	public Product findByProductName(String productName);
	
	// productArtist 찾기
	public Product findByProductAtrist(String productArtist);

	
}
