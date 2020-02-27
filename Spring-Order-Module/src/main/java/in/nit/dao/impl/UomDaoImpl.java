package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;
import in.nit.model.ShipmentType;
import in.nit.model.UomType;
@Repository
public class UomDaoImpl implements IUomDao{

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveShipment(UomType ship) {

		
		return (Integer)ht.save(ship);
	}

	@Override
	public void updateShipmentType(UomType ship) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShipmentType(UomType id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UomType getOneShipmentType(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UomType> getAllShipmentType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
