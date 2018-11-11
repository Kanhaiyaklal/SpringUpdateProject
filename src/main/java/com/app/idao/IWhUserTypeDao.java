package com.app.idao;

import java.util.List;

import com.app.model.WhUserType;

public interface IWhUserTypeDao {

	public Integer saveUom(WhUserType u);
	public void deleteUom(Integer e);
	public void updateUom(WhUserType uom);
	public WhUserType getOneUom(Integer uom);
	public List<WhUserType>getAllUOM(); 
	public List<WhUserType>getWhUserTypeById(String s);
	
	
}
