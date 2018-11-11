package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.idao.IWhUserTypeDao;
import com.app.model.UOM;
import com.app.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao{
	 @Autowired
		private HibernateTemplate ht;
	@Override
	public Integer saveUom(WhUserType u) {
		return (Integer)ht.save(u);
	}

	@Override
	public void deleteUom(Integer e) {
		UOM m=new UOM();
		m.setId(e);
		ht.delete(m);
			
	}

	@Override
	public void updateUom(WhUserType uom) {
		ht.update(uom);
		
	}

	@Override
	public WhUserType getOneUom(Integer uom) {
		return ht.get(WhUserType.class,uom);
	}

	@Override
	public List<WhUserType> getAllUOM() {
		return ht.loadAll(WhUserType.class);
	}

	@Override
	public List<WhUserType> getWhUserTypeById(String s) {
		
		String hql="from " +WhUserType.class.getName()+" where utype=?";
		
		List<WhUserType> userType=(List<WhUserType>)ht.find(hql,s);
		return userType;
	}

	
	
	
}
