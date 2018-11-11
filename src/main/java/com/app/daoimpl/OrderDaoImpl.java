package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IOrderDao;
import com.app.model.Order;
@Repository
public class OrderDaoImpl implements IOrderDao{
    @Autowired
	private HibernateTemplate ht;
	@Override
	@Transactional
	public Integer saveOrder(Order r) {
		
		return (Integer)ht.save(r);
	}
	@Override
	public List<Order> getAllOrder() {
	       List<Order> list=ht.loadAll(Order.class);
		   return list;
	}
	@Override
	@Transactional
	public void deleteOrder(Integer r) {
		Order o=new Order();
		o.setId(r);
		ht.delete(o);	
	}

	@Override
	@Transactional
	public Order getOneOrder(Integer r) {
		return ht.get(Order.class,r);
		
	
	}
	@Override
	@Transactional
	public void updateOrder(Order rp) {
		ht.update(rp);
	}
	@Override
	@Transactional(readOnly=true)
	public List<Order> getOrderByMode(String mode) {
		
		String hql="from " + Order.class.getName() +" where saleMode=?";
	
		List<Order>oms=(List<Order>)ht.find(hql,mode);
		return oms;
		//return ht.loadAll(Order.class);
	}

}
