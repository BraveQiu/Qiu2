package com.demo.service;
/**
 * 业务层
 * 		抽象耦合
 * 		上层调用下层接口
 * @author Brave Qiu
 * 
 */

import com.demo.dao.IOrderDao;
import com.demo.entity.Order;

public class OrderService implements IOrderService{
	private IOrderDao orderDao;
	//构造注入
	public OrderService() {}
	public OrderService(IOrderDao orderDao) {
		this.orderDao = orderDao;
	}
	//setter注入
	public void setOrderDao(IOrderDao orderDao) {
		this.orderDao = orderDao;
	}
	//业务实现
	public void save(Order order) {
		orderDao.save(order);
	}
	public void update(Order order) {
		orderDao.update(order);
	}
	public void delete(Order order) {
		orderDao.delete(order);
	} 
}
