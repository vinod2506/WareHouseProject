package in.nit.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IPartDao;
import in.nit.model.Part;
import in.nit.service.IPartService;

@Service
public class PartServiceImpl implements IPartService{

	@Autowired
	private IPartDao dao;
	
	@Override
	public Integer savePart(Part p) {
           return dao.savePart(p);
	}

	@Override
	public void deletePart(Integer id) {
	dao.deletePart(id);
		
	}

	@Override
	public void updatePart(Part p) {
	   dao.updatePart(p);
		
	}

	@Override
	public Part getOnePart(Integer id) {
		
		return dao.getOnePart(id);
	}

	@Override
	public List<Part> getAllPart() {
		
		return dao.getAllPart();
	}

	


}
