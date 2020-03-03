package in.nit.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IUomDao;
import in.nit.model.UomType;
import in.nit.service.IUomService;
@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;
	
	@Transactional
	@Override
	public Integer saveUom(UomType uom) {
		
		return dao.saveUomType(uom);
	}

	@Override
	@Transactional
	public void deleteUom(Integer id) {
		dao.deleteUomType(id);
	}

	@Override
	@Transactional
	public void updateUom(UomType uom) {
		dao.updateUomType(uom);
		
	}

	@Override
	public UomType getOneUom(Integer id) {
		
		return dao.getOneUomType(id);
	}

	@Override
	public List<UomType> getAllUom() {
		
		return dao.getAllUomType();
	}

	@Override
	public boolean isUomExist(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
}
