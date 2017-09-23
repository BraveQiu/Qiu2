package com.demo.entity;
/**
 * Entity层：
 * 		声明领域模型对象的字段
 * 		私有的属性、公共的getter和setter
 * 实体订单类
 * @author Brave Qiu
 *
 */

import java.util.Date;

public class Order {
	private Long id;
	private String orderNumber;
	private Date createTime;
	private String level;
	private float price;
	public Long getId() {
		return id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public String getLevel() {
		return level;
	}
	public float getPrice() {
		return price;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
