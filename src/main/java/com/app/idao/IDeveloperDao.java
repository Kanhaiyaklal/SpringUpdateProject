package com.app.idao;

import java.util.List;

import com.app.model.Developer;
import com.app.model.Project;

public interface IDeveloperDao {
	public Integer saveDeveloper(Developer d);
	public List<Developer> getAllData();
	public  void deleteData(Integer id);
	public Developer getOneProjectById(Integer e);
	public void UpdateData(Developer p);
}
