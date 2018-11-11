package com.app.idao;

import java.util.List;

import com.app.model.Developer;
import com.app.model.Item;

public interface IItemDao {
	public Integer SaveData(Item e);
	
	public List<Item> getAllData();
	public  void deleteData(Integer id);
	public Item getOneProjectById(Integer e);
	public void UpdateData(Item p);
}

