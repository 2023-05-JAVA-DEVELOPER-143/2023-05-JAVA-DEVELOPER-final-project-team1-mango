package com.itwill.jpa.dto.cart;


import com.itwill.jpa.entity.product.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CartItemDto {
	
	private Long cartItemId;
	private int cartItemQty;
	private Long cartId;
	private Long productNo;

	public static CartItemDto toDto(CartItemDto entity) {
		return CartItemDto.builder()
							.cartItemId(entity.getCartItemId())
							.cartItemQty(entity.getCartItemQty())
							.cartId(entity.getCartId())
							.productNo(entity.getProductNo())
							.build();
	}
}
