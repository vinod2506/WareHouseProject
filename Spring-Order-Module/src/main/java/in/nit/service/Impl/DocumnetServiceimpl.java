package in.nit.service.Impl;

import in.nit.dao.IDocumentDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.service.IDocumentService;
import in.nit.model.DocumentData;
@Service
public class DocumnetServiceimpl implements IDocumentService {

	@Autowired
	private IDocumentDao dao;

	@Transactional
	public Integer saveDocumnet(DocumentData data) {

		return dao.saveDocumnet(data);


	}

	@Override
	public List<Object[]> getDocumentAndFileName() {

		
		return dao.getDocumentAndFileName();
	}
	
 @Override
public DocumentData getOneDocument(Integer id) {

	 return dao.getOneDocument(id);
}  
}
