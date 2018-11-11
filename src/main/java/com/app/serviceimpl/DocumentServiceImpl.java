package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IDocumentDao;
import com.app.iservice.IDocumentService;
import com.app.model.Document;
@Service
public class DocumentServiceImpl implements IDocumentService{
	@Autowired
  private IDocumentDao dao;
  
	@Transactional
	public int saveDocument(Document doc) {
		
		return dao.saveDocument(doc);
	}

	@Transactional(readOnly=true)
	public List<Object[]> getDocumentIdAndName() {
		List<Object[]> obj=dao.getDocumentIdAndName();
		return obj;
	}

	@Override
	@Transactional
	public Document getDocumentById(int docId) {
		
		return dao.getDocumentById(docId);
	}

}
