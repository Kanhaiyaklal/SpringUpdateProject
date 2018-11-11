package com.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.idao.IUomDao;
import com.app.iservice.IUomService;
import com.app.model.UOM;
@Service
public class UomServiceImpl implements IUomService{
	@Autowired
	private IUomDao dao;
	@Override
	@Transactional
	public Integer saveUom(UOM u) {
		
		return dao.saveUom(u);
	}
	@Override
	public List<UOM> getAllUOM() {
		List<UOM>um=dao.getAllUOM();
		return um;
	}
	
	@Override
	public UOM getOneUom(Integer uom) {
		
		return dao.getOneUom(uom);
	}
	@Override
	public void updateUom(UOM uom) {
		dao.updateUom(uom);
	}
	@Override
	public void deleteUom(Integer e) {
		dao.deleteUom(e);
	}
	
	
}
