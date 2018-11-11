package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IItemDao;
import com.app.model.Developer;
import com.app.model.Item;
@Repository
public class ItemDaoImpl implements IItemDao{
@Autowired
private HibernateTemplate ht;
	@Override
	@Transactional
	public Integer SaveData(Item e) {
		
		return (Integer)ht.save(e) ;
	}
	@Override
	public List<Item> getAllData() {
		
		return ht.loadAll(Item.class);
	}
	@Override
	public void deleteData(Integer id) {
		ht.delete(new Item(id));
		
	}
	@Override
	public Item getOneProjectById(Integer e) {
		
		return ht.get(Item.class, e);
	}
	@Override
	public void UpdateData(Item p) {
	ht.update(p);
		
	}
	
}