package in.nit.service;

import java.util.List;

import in.nit.model.OrderType;

public interface IOrderService {

	Integer saveOrder(OrderType o);
	void deleteOrder(Integer id);
	void updateOrder(OrderType o);
	OrderType fetchOneOrder(Integer id);
	List<OrderType> fetchAllOrder();
}
