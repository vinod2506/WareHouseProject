package in.nit.service;

import java.util.List;

import in.nit.model.Part;

public interface IPartService {

	Integer savePart(Part p);
	void deletePart(Integer id);
	void updatePart(Part p);
	Part getOnePart(Integer id);
	List<Part> getAllPart();
}
