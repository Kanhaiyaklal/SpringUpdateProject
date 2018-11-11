package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IProjectDao;
import com.app.model.Project;
@Repository
public class ProjectDaoImpl implements IProjectDao{
    @Autowired 
    private HibernateTemplate ht;
	@Override
	@Transactional
	public Integer saveProject(Project d) {
		
		return (Integer)ht.save(d);
	}

	@Override
	public List<Project> getAllData() {
		
		
		return ht.loadAll(Project.class);
	}

	@Override
	@Transactional
	public void deleteData(Integer id) {
		
	ht.delete(new Project(id));	
		
	}

	@Override
	@Transactional(readOnly=true)
	public Project getOneProjectById(Integer e) {
		
		return ht.get(Project.class,e);
	}

	@Override
	@Transactional
	public void UpdateData(Project p) {
		ht.update(p);
		
		
	}





}
