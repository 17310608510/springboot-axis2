package com.example.demo.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年12月1日 下午3:14:56
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class User implements Serializable {
	@XmlElement(required = true, nillable = true)
	private String name;
	@XmlElement(required = true, nillable = true)
	private String age;
	@XmlElement(required = true, nillable = true)
	private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
