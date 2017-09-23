package com.demo.web;
/**
 * 控制层
 * @author Brave Qiu
 *
 */

import com.demo.dao.OrderHibernateDao;
import com.demo.service.IOrderService;
import com.demo.service.OrderService;

public class OrderControllor {
	IOrderService service = new OrderService(new OrderHibernateDao());
	
	
}
