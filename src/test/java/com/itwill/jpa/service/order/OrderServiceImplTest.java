package com.itwill.jpa.service.order;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.itwill.jpa.TeamProjectMangoApplicationTest;
import com.itwill.jpa.dao.order.DeliveryDao;
import com.itwill.jpa.dao.user.UserDao;
import com.itwill.jpa.dto.order.OrderDto;
import com.itwill.jpa.entity.order.Delivery;
import com.itwill.jpa.entity.order.Order;
import com.itwill.jpa.entity.order.Order.OrderStatus;
import com.itwill.jpa.entity.user.User;
import com.itwill.jpa.repository.order.DeliveryRepository;
import com.itwill.jpa.repository.order.OrderRepository;
import com.itwill.jpa.repository.user.UserRepository;
import com.itwill.jpa.service.user.UserServiceImpl;

import jakarta.transaction.Transactional;

class OrderServiceImplTest extends TeamProjectMangoApplicationTest{

	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	DeliveryServiceImpl deliveryServiceImpl;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	DeliveryDao deliveryDao;
	
	//주문 생성(실패)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void orderCreateTest() {
		OrderDto orderDto = new OrderDto();
		User user = userDao.findUser("why3795");
		Delivery delivery = deliveryDao.insertDelivery(Delivery.builder().deliveryId(20L).build());
		
		
		orderDto.setOrderId(null);
		orderDto.setOrderPrice(20000);
		orderDto.setOrderStatus(OrderStatus.배송준비중);
		
		
		userRepository.save(user);
		deliveryRepository.save(delivery);
		OrderDto createdOrderDto = orderServiceImpl.saveOrder(orderDto);
		System.out.println(createdOrderDto);
	}
	
	
	//주문 정보 수정(성공)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void orderUpdateTest() throws Exception {
		Order order = orderRepository.findById(1L).get();
		OrderDto orderDto = OrderDto.toDto(order);
		orderDto.setOrderPrice(333333333);
		orderDto.setOrderStatus(OrderStatus.결제완료);
		OrderDto updatedOrderDto = orderServiceImpl.updateOrder(orderDto);
		System.out.println(updatedOrderDto);
	}
	
	//주문 한개 삭제(성공)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void orderDeleteOneTest() throws Exception {
		orderServiceImpl.deleteOrder(3L);
		
	}

	//주문 전체 삭제(성공)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void orderDeleteAllTest() throws Exception {
		/*
		// 모든 주문(Order)을 가져온다
		List<Order> orders = orderServiceImpl.orders();

		// 주문과 연결된 유저(User)와 배송(Delivery)를 삭제
		for (Order order : orders) {
			User user = order.getUser();
			Delivery delivery = order.getDelivery();
			
			order.setUser(null);
			order.setDelivery(null);
			
			
			// 유저(User)와 배송(Delivery) 삭제
			userServiceImpl.deleteUser(user.getUserId());
			deliveryServiceImpl.deleteDelivery(delivery.getDeliveryId());

			// 주문(Order) 삭제
			orderServiceImpl.deleteAllOrder();
		}
		*/
		orderServiceImpl.deleteAllOrder();
	}
	
	//유저 아이디로 주문 전체 불러오기(성공)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void orderByUserIdTest() {
		List<OrderDto> orderDtoList = orderServiceImpl.ordersByUserId("팀장님");
		System.out.println(orderDtoList);
	}
	
	//전체 주문 불러오기(관리자)(성공)
	@Test
	@Transactional
	@Rollback(false)
	@Disabled
	void findAllOrders() {
		List<OrderDto> orderDtoList = orderServiceImpl.orders();
		System.out.println(orderDtoList);
	}
	
	
	//주문 최신순으로 나열하기(성공)
	@Test
	@Transactional
	@Rollback(true)
	@Disabled
	void orderListByNewer() {
		List<OrderDto> orderDtoList = orderServiceImpl.orderListByNewer("why3795");
		System.out.println(orderDtoList);
	}
	
	//주문 오래된순으로 나열하기(성공)
	@Test
	@Transactional
	@Rollback(true)
	@Disabled
	void orderListByOlder() {
		List<OrderDto> orderDtoList = orderServiceImpl.orderListByOlder("why3795");
		System.out.println(orderDtoList);
	}
	
}
