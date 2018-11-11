package com.app.iservice;

import java.util.List;

import com.app.model.UOM;

public interface IUomService {

	public Integer saveUom(UOM u);
	public void deleteUom(Integer e);
	public void updateUom(UOM uom);
	public UOM getOneUom(Integer uom);
	public List<UOM>getAllUOM(); 
	
}
