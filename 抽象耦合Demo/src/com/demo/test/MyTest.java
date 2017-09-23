package com.demo.test;

import com.demo.dao.OrderHibernateDao;
import com.demo.dao.OrderJDBCDao;
import com.demo.entity.Order;
import com.demo.service.OrderService;

/**
 * 测试类
 * @author Brave Qiu
 *
 */
public class MyTest {
	public static void main(String[] args) {
		OrderService service = new OrderService(new OrderJDBCDao());
		Order order = new Order();
		service.save(order);
		OrderService service2 = new OrderService();
		service2.setOrderDao(new OrderHibernateDao());
		service2.save(order);
	}
}
