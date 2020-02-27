package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;
import in.nit.model.UomType;

public interface IUomDao {

	Integer saveShipment(UomType ship);
	void updateShipmentType(UomType ship);
	void deleteShipmentType(UomType id);
	UomType getOneShipmentType(Integer id);
	List<UomType> getAllShipmentType();
}
