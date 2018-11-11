package com.app.idao;

import java.util.List;

import com.app.model.Document;

public interface IDocumentDao {
	public int saveDocument(Document doc);
	public  List<Object[]> getDocumentIdAndName();
	public Document getDocumentById(int docId);
	
}
