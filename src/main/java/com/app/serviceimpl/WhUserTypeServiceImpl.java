package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IWhUserTypeDao;
import com.app.iservice.IWhUserTypeService;
import com.app.model.WhUserType;
@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;
	@Override
	@Transactional
	public Integer saveUom(WhUserType u) {
		
		return dao.saveUom(u);
	}

	@Override
	@Transactional
	public void deleteUom(Integer e) {
		
		dao.deleteUom(e);
	}

	@Override
	@Transactional
	public void updateUom(WhUserType uom) {
		dao.updateUom(uom);
	}

	@Override
	@Transactional(readOnly=true)
	public WhUserType getOneUom(Integer uom) {
		return dao.getOneUom(uom);
	}

	@Override
	@Transactional(readOnly=true)
	public List<WhUserType> getAllUOM() {
		List<WhUserType>um=dao.getAllUOM();
		return um;
	}

	@Override
	@Transactional(readOnly=true)
	public List<WhUserType> getWhUserTypeById(String s) {
	
		return dao.getWhUserTypeById(s);
	}

	
	
	
	
	
	
	
}
