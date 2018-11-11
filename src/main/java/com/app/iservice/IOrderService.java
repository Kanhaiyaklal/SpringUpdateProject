package com.app.iservice;

import java.util.List;

import com.app.model.Order;


public interface IOrderService {

	public Integer saveOrder(Order r);
	public void deleteOrder(Integer r);
	public void updateOrder(Order r);
	public Order getOneOrder(Integer r);
	public List<Order>getAllOrder(); 
	public List<Order>getOrderByMode(String mode);		
}
