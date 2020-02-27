package in.nit.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService{

	@Autowired
	IShipmentTypeDao dao;

	@Override
	@Transactional
	public Integer saveShipment(ShipmentType ship) {

		
		return dao.saveShipment(ship);
	}

	@Override
	@Transactional
	public void updateShipmentType(ShipmentType ship) {

		dao.updateShipmentType(ship);
	}

	@Override
	@Transactional
	public void deleteShipmentType(ShipmentType id) {
		dao.deleteShipmentType(id);
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
          
		return dao.getOneShipmentType(id);
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
       List<ShipmentType>list=dao.getAllShipmentType();
	List<ShipmentType>sort=	list.stream().sorted((o1,o2)->o1.getSid()-o2.getSid()).collect(Collectors.toList());
		return sort;
	}
	
	

}
