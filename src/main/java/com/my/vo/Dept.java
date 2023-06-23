package com.my.vo;


public class Dept implements java.io.Serializable{

	private Integer id;		// id
	private String name;	// 部门名称
	private String number;	// 详细描述
	// 无参数构造器

	public Dept() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"id=" + id +
				", name='" + name + '\'' +
				", number='" + number + '\'' +
				'}';
	}
}