package com.demo.dao;

import com.demo.entity.Order;

/**
 * 下层
 * @author Brave Qiu
 *
 */
public class OrderJDBCDao implements IOrderDao{
	public void save(Order order) {
		System.out.println("jdbc save method!");
	}

	public void update(Order order) {
		System.out.println("jdbc update method!");
	}

	public void delete(Order order) {
		System.out.println("jdbc delete method!");
	}
}
