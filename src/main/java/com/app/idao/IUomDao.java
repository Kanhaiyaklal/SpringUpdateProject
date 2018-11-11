package com.app.idao;

import java.util.List;

import com.app.model.UOM;

public interface IUomDao {

	public Integer saveUom(UOM u);
	public void updateUom(UOM uom);
	public void deleteUom(Integer e);
	public UOM getOneUom(Integer uom);
	public List<UOM>getAllUOM(); 
	
	
}
