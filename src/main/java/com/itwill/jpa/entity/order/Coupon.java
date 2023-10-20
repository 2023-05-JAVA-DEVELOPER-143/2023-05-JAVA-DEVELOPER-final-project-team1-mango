package com.itwill.jpa.entity.order;

import java.sql.Date;
import java.time.LocalDateTime;

import com.itwill.jpa.dto.order.CouponDto;
import com.itwill.jpa.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "coupon")
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Builder
public class Coupon {

	
//	/*멤버필드*/
//	
//	
//	@Id
//	@SequenceGenerator(name = "COUPON_COUPON_NO_SEQ",sequenceName = "COUPON_COUPON_NO_SEQ",initialValue = 1 , allocationSize =1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUPON_COUPON_NO_SEQ")
//	//PK 쿠폰 번호
//	private Long couponId;
//	
//	//1개월짜리 쿠폰, 2개월짜리 쿠폰, 12개월짜리 쿠폰 등등
//	private String couponType;
//	
//	//쿠폰일련번호
//	private String couponCode;
//	
//	//쿠폰 할인율
//	private Double couponDiscount;
//	
//	//쿠폰 만료일
//	private Date couponExpirationDate;
//	
//	//사용된 쿠폰인지 확인 여부
//	private int couponIsUsed;
//	
//	private LocalDateTime createdAt;
//	
//	private LocalDateTime updatedAt;
//	
//	// 쿠폰과 유저 n대 1
//	//PK 유저 번호
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private User user;
//	
//	
//	
//	/*메서드*/
//	
//	
//	
//	//Dto -> entity 변환해주는 매서드
//		public static Coupon toEntity(CouponDto dto) {
//			return Coupon.builder()
//						 .build();	
//			
//		}
					
	
}
