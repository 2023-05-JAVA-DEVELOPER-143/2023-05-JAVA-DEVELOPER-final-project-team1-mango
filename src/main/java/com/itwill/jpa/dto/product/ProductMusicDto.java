package com.itwill.jpa.dto.product;


import java.sql.Date;
import java.util.List;

import com.itwill.jpa.entity.product.Product;
import com.itwill.jpa.entity.product.Product.Goods;
import com.itwill.jpa.entity.product.Product.Membership;
import com.itwill.jpa.entity.product.Product.Music;
import com.itwill.jpa.entity.product.Product.Ticket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductMusicDto {
	
	private String productCategory; // 프로덕트 카테고리
	 	
	private String productName;  // 프로덕트 이름
	
	private int productPrice; // 프로덕트 가격
	
	private Long readCount; // 조회수
	
	private String productContent; // 프로덕트(음악,굿즈,콘서트) 설명
	
//	private String productReply; // 프로덕트(음악,굿즈,콘서트) 댓글
	
	private int productStar; // 프로덕트(음악,굿즈,콘서트) 별점
	
	private Date productDate; // 프로덕트(음악,굿즈,콘서트) 등록날짜
	
	private int productStock; // 프로덕트(굿즈, 티켓) 재고
	
	private String productMovie; // 음악 뮤직비디오

	private String productArtist; // 음악 아티스트
	
	private String productAddress; // 콘서트 장소
	
	private Date startPeriod; // 멤버십 시작날짜
	
	private int periodOfUse; // 멤버십 사용기간
	
	private String productImage; // 프로덕트(음악,굿즈,콘서트,멤버십) 등록날짜
	
	private List<Product> products;
	private List<Music> musics;
	private List<Goods> goodss;
	private List<Ticket> tickets;
	private List<Membership> memberships;
	
	
public ProductMusicDto(Product product) {
	this.productName = product.getProductName();
	this.productPrice = product.getProductPrice();
	this.productContent = product.getProductContent();
	this.productStar = product.getProductStar();
	this.productDate = product.getProductDate();
	this.readCount = product.getReadCount();
	this.productStock = product.getProductStock();
	this.productImage = product.getProductImage();
	this.productArtist = product.getProductArtist();
	this.productAddress = product.getProductAddress();
	this.startPeriod = product.getStartPeriod();
	this.periodOfUse = product.getPeriodOfUse();

	}

public static ProductMusicDto toDto(Product entity) {
	return ProductMusicDto.builder()
			.productName(entity.getProductName())
			.productPrice(entity.getProductPrice())
			.productContent(entity.getProductContent())
			.productStar(entity.getProductStar())
			.productDate(entity.getProductDate())
			.readCount(entity.getReadCount())
			.productStock(entity.getProductStock())
			.productImage(entity.getProductImage())
			.productArtist(entity.getProductArtist())
			.productAddress(entity.getProductAddress())
			.startPeriod(entity.getStartPeriod())
			.periodOfUse(entity.getPeriodOfUse())
			.build();
}


}
