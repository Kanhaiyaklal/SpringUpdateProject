package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.idao.IOrderDao;
import com.app.iservice.IOrderService;
import com.app.model.Order;
@Service
public class OrderServiceImpl implements IOrderService{
    @Autowired
	private IOrderDao dao;
	@Override
	@Transactional
	public Integer saveOrder(Order r) {
		
				return dao.saveOrder(r);
	}
	@Override
	public List<Order> getAllOrder() {
		
		
		return dao.getAllOrder();
	}
	@Override
	@Transactional
	public void deleteOrder(Integer r) {
		dao.deleteOrder(r);
		
	}
	
	@Override
	@Transactional
	public Order getOneOrder(Integer r) {
		return dao.getOneOrder(r);
		
	}
	@Override
	public void updateOrder(Order r) {
		dao.updateOrder(r);
		
		
	}
	@Override
	@Transactional(readOnly=true)
	public List<Order> getOrderByMode(String mode) {
	
		return dao.getOrderByMode(mode);
	}

}
