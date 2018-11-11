package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IDeveloperDao;
import com.app.iservice.IDeveloperService;
import com.app.model.Developer;
import com.app.model.Project;
@Service
public class DeveloperServiceImpl implements IDeveloperService{
@Autowired
private IDeveloperDao dao;
	
	@Override
	@Transactional
	public Integer saveDeveloper(Developer d) {
		
		    return  dao.saveDeveloper(d);
		
	}

	@Override
	@Transactional
	public List<Developer> getAllData() {
		
		return dao.getAllData();
	}

	@Override
	@Transactional
	public void deleteData(Integer id) {
		dao.deleteData(id);
		
	}

	@Override
	public Developer getOneProjectById(Integer e) {
		
		return dao.getOneProjectById(e);
	}

	@Override
	@Transactional
	public void UpdateData(Developer p) {
		dao.UpdateData(p);
	}


}
