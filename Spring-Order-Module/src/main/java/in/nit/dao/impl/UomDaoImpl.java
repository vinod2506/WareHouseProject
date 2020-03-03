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
	public Integer saveUomType(UomType ship) {

		
		return (Integer)ht.save(ship);
	}

	@Override
	public void updateUomType(UomType ship) {
		ht.update(ship);
		
	}

	@Override
	public void deleteUomType(Integer id) {
		ht.delete(new UomType(id));
		
	}

	@Override
	public UomType getOneUomType(Integer id) {
		
		return ht.get(UomType.class, id);
	}

	@Override
	public List<UomType> getAllUomType() {
		
		return ht.loadAll(UomType.class);
	}

	@Override
	public boolean isUomExist(Integer id) {
		
		return ht.contains(new UomType(id));
	}
	
	
}
