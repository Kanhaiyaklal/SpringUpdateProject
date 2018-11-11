package com.app.idao;

import java.util.List;

import com.app.model.Developer;
import com.app.model.Project;

public interface IProjectDao {
	public Integer saveProject(Project d);
	public List<Project> getAllData();
	public  void deleteData(Integer id);
	public Project getOneProjectById(Integer e);
	public void UpdateData(Project p);
}
