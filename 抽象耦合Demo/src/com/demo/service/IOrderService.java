package com.demo.service;

import com.demo.entity.Order;

/**
 * service接口
 * @author Brave Qiu
 *
 */
public interface IOrderService {
	public void save(Order order);
	public void update(Order order);
	public void delete(Order order);
}
