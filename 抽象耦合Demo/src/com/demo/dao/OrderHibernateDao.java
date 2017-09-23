package com.demo.dao;

import com.demo.entity.Order;

/**
 * 下层(实现接口)
 * @author Brave Qiu
 *
 */
public class OrderHibernateDao implements IOrderDao{
	public void save(Order order) {
		System.out.println("Hibernate save method!");
	}

	public void update(Order order) {
		System.out.println("Hibernate update method!");
	}
	
	public void delete(Order order) {
		System.out.println("Hibernate delete method!");
	}
}
