package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IDocumentDao;
import in.nit.model.DocumentData;

@Repository
public class DocumentDaoImpl implements IDocumentDao {

	@Autowired
	private HibernateTemplate ht;
	
	

	public Integer saveDocumnet(DocumentData data) {
		
		return (Integer) ht.save(data);
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getDocumentAndFileName() {
           
		
		String hql="select fileId,filename from in.nit.model.DocumentData";
		return (List<Object[]>) ht.find(hql);
	}
	
	@Override
	public DocumentData getOneDocument(Integer id) {

		return ht.get(DocumentData.class, id);
	}
	
	
	
}
