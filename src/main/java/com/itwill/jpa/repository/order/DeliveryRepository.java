package com.itwill.jpa.repository.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itwill.jpa.dto.order.DeliveryDto;
import com.itwill.jpa.entity.user.User;
@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryDto, Long>{


//	List<Delivery> findByUserId(String userId);
	//List<Delivery> findByUserId(String userId);




 List<DeliveryDto> findByUser(User user);


}

