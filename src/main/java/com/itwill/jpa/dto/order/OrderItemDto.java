package com.itwill.jpa.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {

	private int oiQty;
	
	private String productName;
	
	private String productImage;
	
	private int productPrice;
	


	
//	public OrderItemDto(OrderItem orderItem) {
//		this.productName = orderItem.getProduct().getProductName();
//		this.productPrice = orderItem.getProduct().getProductPrice();
//		this.ProductImage = orderItem.getProduct().getImage();
//	}
	
	
	
	//OrderDto에서 OrderItemDto를 쓰기위한 메서드
	//(OrderItem entity를 건들지 않기위해 OrderItemDto를 대신해서 사용 = 데이터 무결성 유지 목적)
	/*
	public static OrderItemDto fromOrderItem(OrderItem orderItem) {
		
		OrderItemDto dto = new OrderItemDto();
		dto.setOiQty(orderItem.getOiQty());
		dto.setProductName(orderItem.getProduct().getProductName());
		dto.setProductPrice(orderItem.getProduct().getProductPrice());
		//dto.setProductImage(orderItem.getProduct().getProductImage());
		return dto;
		
	}
	*/
}
	

	  
    
   
