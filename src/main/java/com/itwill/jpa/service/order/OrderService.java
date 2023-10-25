package com.itwill.jpa.service.order;

import java.util.List;

import com.itwill.jpa.entity.order.Order;

public interface OrderService {
	//주문 생성
	Order saveOrder(Order order);
	//주문 정보 수정
	Order updateOrder(Order order) throws Exception;
	//주문 한개 삭제
	void deleteOrder(Long orderId) throws Exception;
	//주문 전체 삭제
	void deleteAllOrder() throws Exception;
	//유저 Id로 전체 주문 불러오기
	List<Order> ordersByUserId(String UserId);
	//전체 주문 불러오기(관리자)
	List<Order> orders();
	//주문 최신순으로 나열하기
	List<Order> orderListByNewer(String userId);
	//주문 오래된순으로 나열하기
	List<Order> orderListByOlder(String userId);
	
	

}
