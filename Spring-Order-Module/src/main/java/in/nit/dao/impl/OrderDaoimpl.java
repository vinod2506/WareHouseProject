package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderDao;
 
import in.nit.model.OrderType;

@Repository
public class OrderDaoimpl implements IOrderDao{

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveOrder(OrderType o) {
     System.out.println("OrderDaoimpl.saveOrder()");
		
		return (Integer)ht.save(o);
	}
	@Override
	public void deleteOrder(Integer id) {
		ht.delete(new OrderType(id));
		
	}
	@Override
	public void updateOrder(OrderType o) {
		ht.update(o);
		
	}
	@Override
	public OrderType fetchOneOrder(Integer id) {

		return ht.get(OrderType.class, id);
	}
	@Override
	public List<OrderType> fetchAllOrder() {

		return ht.loadAll(OrderType.class);
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Object[]> getOrderMethodCount() {
		String hql="select odrMethod ,count(odrMethod) from in.nit.model.OrderType group by odrMethod";
		
		return (List<Object[]>) ht.find(hql);
	}
}
