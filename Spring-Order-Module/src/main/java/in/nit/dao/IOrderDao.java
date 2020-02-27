package in.nit.dao;

import java.util.List;

import in.nit.model.OrderType;

public interface IOrderDao {

	Integer saveOrder(OrderType o);
	void deleteOrder(Integer id);
	void updateOrder(OrderType o);
	OrderType fetchOneOrder(Integer id);
	List<OrderType> fetchAllOrder();
}
