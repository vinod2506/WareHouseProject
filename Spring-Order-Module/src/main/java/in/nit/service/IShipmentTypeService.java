package in.nit.service;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeService {

	Integer saveShipment(ShipmentType ship);
	void updateShipmentType(ShipmentType ship);
	void deleteShipmentType(ShipmentType id);
	ShipmentType getOneShipmentType(Integer id);
	List<ShipmentType> getAllShipmentType();
	
	List<Object[]> getShipModeCount();
	
}
