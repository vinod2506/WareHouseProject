package in.nit.dao.service;

import java.util.List;

import in.nit.model.DocumentData;

public interface IDocumentService {

	public List<Object[]> getDocumentAndFileName();
	Integer saveDocumnet(DocumentData data);
	DocumentData getOneDocument(Integer id);
}
