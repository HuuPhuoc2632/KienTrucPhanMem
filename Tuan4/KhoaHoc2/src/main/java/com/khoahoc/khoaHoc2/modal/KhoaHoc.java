package com.khoahoc.khoaHoc2.modal;

import java.io.Serializable;

public class KhoaHoc implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String img;

	private String shortDescription;
	private double price;
	private String userName;
	public KhoaHoc() {
		// TODO Auto-generated constructor stub
	}

	public KhoaHoc(long id, String name, String img, String shortDescription, double price, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.shortDescription = shortDescription;
		this.price = price;
		this.userName = userName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CourseResponse [name=" + name + ", img=" + img + ", shortDescription=" + shortDescription + ", price="
				+ price + ", userName=" + userName + "]";
	}






}
