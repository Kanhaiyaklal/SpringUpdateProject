package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IDocumentDao;
import com.app.model.Document;
@Repository
public class DocumentDaoImpl implements IDocumentDao {
    @Autowired
    private HibernateTemplate ht;
	@Override
	@Transactional
	public int saveDocument(Document doc) {
		return (int)ht.save(doc);
	}
	@Override
	@Transactional(readOnly=true)
	public List<Object[]> getDocumentIdAndName() {
		
		String sql="select fileId,fileName from "+Document.class.getName();
		List<Object[]>data=(List<Object[]>)ht.find(sql);
		return data;
		
	}
	@Override
	@Transactional
	public Document getDocumentById(int docId) {
		
		return ht.get(Document.class, docId);
	}

}
