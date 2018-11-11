package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IProjectDao;
import com.app.iservice.IProjectService;
import com.app.model.Project;
@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private IProjectDao dao;
	@Override
	@Transactional
	public Integer saveProject(Project d) {
		
		return dao.saveProject(d);
	}

	@Override
	public List<Project> getAllData() {
		
		return dao.getAllData();
	}

	@Override
	@Transactional
	public void deleteData(Integer id) {
	dao.deleteData(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Project getOneProjectById(Integer e) {
		
		return dao.getOneProjectById(e)
				;
	}

	@Override
	public void UpdateData(Project p) {
	dao.UpdateData(p);	
		
	}


}
