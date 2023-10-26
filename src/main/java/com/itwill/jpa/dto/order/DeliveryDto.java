package com.itwill.jpa.dto.order;


import com.itwill.jpa.entity.order.Delivery;
import com.itwill.jpa.entity.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//웹에서 고객에게 보여주기 위한 정보를 담은 객체(Dto)
public class DeliveryDto {
	
	private Long deliveryId;

	private String deliveryName;
	
	private String deliveryPhone;
	
	private String deliveryAddress;
	
	private String deliveryCompany; //담당 택배 회사(ex. 우체국, CJ대한통운)
	
	
	//Dto에서 고객에게 보여주는 주문 정보들이 어떤값인지를 설정하는 생성자(초기화)
	public  DeliveryDto(Delivery delivery) {
		this.deliveryName = delivery.getDeliveryName();
		this.deliveryPhone = delivery.getDeliveryPhone();
		this.deliveryAddress = delivery.getDeliveryAddress();
		this.deliveryCompany = delivery.getDeliveryCompany();
	}
	
	//Dto -> entity 변환해주는 매서드
	public static Delivery toDto(DeliveryDto dto) {
		return Delivery.builder()
					   .deliveryId(dto.getDeliveryId())
					   .deliveryName(dto.getDeliveryName())
					   .deliveryPhone(dto.getDeliveryPhone())
					   .deliveryAddress(dto.getDeliveryAddress())
					   .deliveryCompany(dto.getDeliveryCompany())
					   .build();
	}

}
