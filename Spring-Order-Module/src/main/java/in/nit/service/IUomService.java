package in.nit.service;

import java.util.List;

import in.nit.model.UomType;

public interface IUomService {

	Integer saveUom(UomType uom);
	void deleteUom(Integer id);
	void updateUom(UomType uom);
	UomType getOneUom(Integer id);
	List<UomType> getAllUom();
	boolean isUomExist(Integer id);
}
