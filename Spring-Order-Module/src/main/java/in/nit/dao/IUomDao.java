package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;
import in.nit.model.UomType;

public interface IUomDao {

	Integer saveUomType(UomType ship);
	void updateUomType(UomType ship);
	void deleteUomType(Integer id);
	UomType getOneUomType(Integer id);
	List<UomType> getAllUomType();
	
	boolean isUomExist(Integer id);
}
