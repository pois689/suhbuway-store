package project.suhbuway.service;

import java.util.List;

import project.suhbuway.wrapper.OrderListWrapper;

/**
 * 사이트 주문하기 과정에서 필요한 서비스
 * 
 * @author hkarling
 */
public interface OrderService {

	/**
	 * 유저별 주문 리스트들을 불러오는 메서드
	 */
	public List<OrderListWrapper> selectOrderListByStore(String storeId);
	
	
	
	/**
	 * 주문을 저장한다.
	 */
//	public String insertOrder(OrderInsertWrapper[] newOrders, Store store, String userId);

}
