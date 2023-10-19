package com.itwill.jpa.dao.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.itwill.jpa.entity.order.Delivery;
import com.itwill.jpa.repository.order.DeliveryRepository;

public class DeliveryDaoImpl implements DeliveryDao {

	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Override
	public Delivery insertDelivery(Delivery delivery) {
		Delivery savedDelivery = deliveryRepository.save(delivery);
		return savedDelivery;
	}

	@Override
	public Delivery selectDelivery(Long deliveryNo){
		Delivery selectDelivery = deliveryRepository.findById(deliveryNo).get();
		return selectDelivery;
	}

	@Override
	public Delivery updateDelivery(Delivery delivery) {
//		//Delivery가 존재하는지 확인
//		Optional<Delivery> findDeliveryOptional = deliveryRepository.findById(delivery.getDeliveryNo());
//		if(findDeliveryOptional.isPresent()) {
//			Delivery delivery = findDeliveryOptional.get();
//		
//		}
		return null;
	}

	@Override
	public void deleteDelivery(Long deliveryNo) throws Exception{
		//Delivery가 존재하는지 확인 -> 없으면 오류 메세지 던지기
		Optional<Delivery> deleteDeliveryOptional = deliveryRepository.findById(deliveryNo);
		if(deleteDeliveryOptional.isEmpty()) {
			throw new Exception("삭제할 주소가 존재하지 않습니다.");
		}
		deliveryRepository.delete(deleteDeliveryOptional.get());
	}

	@Override
	public List<Delivery> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

}
