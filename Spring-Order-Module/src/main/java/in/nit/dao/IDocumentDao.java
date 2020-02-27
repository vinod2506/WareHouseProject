package in.nit.dao;

import java.util.List;

import in.nit.model.DocumentData;

public interface IDocumentDao {

	Integer saveDocumnet(DocumentData data);
	List<Object[]> getDocumentAndFileName();
	DocumentData getOneDocument(Integer id);

	
}
