package in.nit.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;

@Repository
public class ShipmentDaoImpl implements IShipmentTypeDao {

	
	@Autowired
	HibernateTemplate ht;
	
	@Override

	public Integer saveShipment(ShipmentType ship) {
         
		
		return (Integer)ht.save(ship);
	}

	@Override

	public void updateShipmentType(ShipmentType ship) {
		ht.update(ship);
	}

	@Override
	public void deleteShipmentType(ShipmentType ship) {
            ht.delete(ship);
		
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {

		return ht.get(ShipmentType.class, id);
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {

		return ht.loadAll(ShipmentType.class);
	}




}
