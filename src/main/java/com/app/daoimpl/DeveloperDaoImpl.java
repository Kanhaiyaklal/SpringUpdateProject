package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.idao.IDeveloperDao;
import com.app.model.Developer;
@Repository
public class DeveloperDaoImpl implements IDeveloperDao{
     @Autowired
     private HibernateTemplate ht;
	@Override
	public Integer saveDeveloper(Developer d) {
	         
		return (Integer)ht.save(d);
	}
	@Override
	@Transactional
	public List<Developer> getAllData() {
		
		return ht.loadAll(Developer.class);
	}
	@Override
	public void deleteData(Integer id) {
		ht.delete(new Developer(id));
	}
	@Override
	public Developer getOneProjectById(Integer e) {
		
		return ht.get(Developer.class,e);
	}
	@Override
	public void UpdateData(Developer p) {
	ht.update(p);
		
	}

}
