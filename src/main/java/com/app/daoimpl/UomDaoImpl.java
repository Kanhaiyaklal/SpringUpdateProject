package com.app.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.idao.IUomDao;
import com.app.model.UOM;
@Repository
public class UomDaoImpl implements IUomDao{
     @Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveUom(UOM u) {
		
		return (Integer)ht.save(u);
	}
	@Override
	@Transactional
	public List<UOM> getAllUOM() {
	
		return ht.loadAll(UOM.class);
		
	}
	
	@Override
	public UOM getOneUom(Integer uom) {
		
		return ht.get(UOM.class,uom);
	}
	@Override
	@Transactional
	public void updateUom(UOM uom) {
		
		ht.update(uom);
		
	}
	@Override
	@Transactional
	public void deleteUom(Integer e) {
		UOM m=new UOM();
		m.setId(e);
		ht.delete(m);
		
	}
	
	

}
