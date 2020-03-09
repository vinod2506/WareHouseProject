package in.nit.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IOrderDao;
import in.nit.model.OrderType;
import in.nit.service.IOrderService;
@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private IOrderDao dao;
	@Override
	@Transactional
	public Integer saveOrder(OrderType o) {
 System.out.println("OrderServiceImpl.saveOrder()");
		
		return (Integer)dao.saveOrder(o);
	}
	@Override
	@Transactional
	public void deleteOrder(Integer id) {

		dao.deleteOrder(id);
	}
	@Override
	@Transactional
	public void updateOrder(OrderType o) {

		dao.updateOrder(o);
	}
	@Override
	public OrderType fetchOneOrder(Integer id) {

		return dao.fetchOneOrder(id);
	}
	@Override
	public List<OrderType> fetchAllOrder() {

		return dao.fetchAllOrder();
	}
	@Override
	public List<Object[]> getOrderMethodCount() {
		
		return dao.getOrderMethodCount();
	}
	
	@Override
	public List<Object[]> getOrderIdOrderMode(String mode) {
		
		return dao.getOrderIdMode(mode);
	}

}
