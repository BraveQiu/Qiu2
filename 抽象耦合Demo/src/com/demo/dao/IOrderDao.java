package com.demo.dao;

import com.demo.entity.Order;

/**
 * 抽象接口
 * @author Brave Qiu
 *
 */
public interface IOrderDao {
	public void save(Order order);
	public void update(Order order);
	public void delete(Order order);
}
