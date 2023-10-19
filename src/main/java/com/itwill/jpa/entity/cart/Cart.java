package com.itwill.jpa.entity.cart;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.itwill.jpa.dto.cart.CartDto;
import com.itwill.jpa.dto.cart.CartItemDto;
import com.itwill.jpa.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cartId;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn
	@Builder.Default
	private User user =new User();
	
	private int CartTotPrice;
	
	@CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    
    public static Cart toEntity(CartDto dto) {
    	return Cart.builder()
    				.CartTotPrice(dto.getCartTotPrice())
    				.build();
    }
    
	
	
    
    
}