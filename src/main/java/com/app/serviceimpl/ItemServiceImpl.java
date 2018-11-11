package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IItemDao;
import com.app.iservice.IItemService;
import com.app.model.Developer;
import com.app.model.Item;
@Service
public class ItemServiceImpl implements IItemService{

	@Autowired
	private IItemDao dao;
	@Override
	public Integer SaveData(Item e) {
	
		return dao.SaveData(e);
	}
	@Override
	public List<Item> getAllData() {
		
		return dao.getAllData();
	}
	@Override
	@Transactional
	public void deleteData(Integer id) {
		dao.deleteData(id);
		
	}
	@Override
	@Transactional
	public Item getOneProjectById(Integer e) {
		
		return dao.getOneProjectById(e);
	}
	@Override
	@Transactional
	public void UpdateData(Item p) {
		
		dao.UpdateData(p);
	}
 

}
