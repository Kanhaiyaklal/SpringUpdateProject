package com.app.iservice;

import java.util.List;

import org.bouncycastle.mail.smime.handlers.pkcs7_mime;

import com.app.model.Developer;
import com.app.model.Project;

public interface IProjectService {
	public Integer saveProject(Project d);
	public List<Project> getAllData();
	public  void deleteData(Integer id);
	public Project getOneProjectById(Integer e);
	public void UpdateData(Project p);

}
